const {Genre, validate} = require('../models/genre');
const mongoose = require('mongoose');
const express = require('express');
const router = express.Router();

router.get('/', async (req, res) => {
  const genres = await Genre.find().sort('name');
  res.send(genres);
});

router.post('/', async (req, res) => {
  const { error } = validate(req.body); 
  if (error) return res.status(400).send(error.details[0].message);

  let genre = new Genre({ name: req.body.name });
  genre = await genre.save();
  
  res.send(genre);
});

router.get('/:id',async (req,res)=>{
  const genre= await Genre.findById(req.params.id).catch((err)=>{
    res.status(404).send('Genre with given id is not found!');
  });

  res.send(genre);

});

router.put('/:id',async (req,res)=>{
  const { error }= validate(req.body);
  if(error) return res.status(400).send(error.details[0].message);
  const genre= await Genre.findByIdAndUpdate(req.params.id,{
    name:req.body.name
  },{new : true}).catch((err)=>{
    res.status(404).send('The genre with the given ID was not found.');
  });

  if (!genre) return res.status(404).send('The genre with the given ID was not found.');
  
  res.status(202).send(genre);
});

router.delete('/:id',async (req, res)=>{
  const genre= await Genre.findByIdAndRemove(req.params.id)
  .catch((err)=>{
    res.status(404).send('Genre with given id is not found!');
  });

  res.status(201).send(genre);
});

module.exports = router;