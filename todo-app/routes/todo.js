const {Todo, validate}=require('../models/todo');
const express=require('express');
const router=express.Router();
const mongoose=require('mongoose');


router.get('/', async(req,res)=>{
    const todo= await Todo.find()
        .catch((err)=>{
            res.status(200).send(err.details[0].message);
        });
    return res.status(200).send(todo);
});

router.post('/', async (req,res)=>{
    const {error}=validate(req.body);
    if(error) return res.status(404).send(error.details[0].message);

    let todo =new Todo({
        description:req.body.description,
        isCompleted:req.body.isCompleted
    });
    todo= await todo.save();
    
    res.status(201).send(todo);
});

router.get('/:id',async (req,res)=>{
    const todo= await Todo.findById(req.params.id)
    .catch((err)=>{
      res.status(404).send('Todo with given id is not found!');
    });
  
    res.status(201).send(todo);
  
  });
  
  router.put('/:id',async (req,res)=>{
    const { error }= validate(req.body);
    if(error) return res.status(400).send(error.details[0].message);
    const todo= await Todo.findByIdAndUpdate(req.params.id,  {
      description:req.body.description,
      isCompleted:req.body.isCompleted
      
    },{new : true}).catch((err)=>{
      res.status(404).send('The todo with the given ID was not found.');
    });;
  
    if (!todo) return res.status(404).send('The todo with the given ID was not found.');
    
    res.status(202).send(todo);
  });
  
  router.delete('/:id',async (req, res)=>{
    const todo= await Todo.findByIdAndRemove(req.params.id)
    .catch((err)=>{
      res.status(404).send('todo with given id is not found!');
    });
  
    res.status(201).send(todo);
  });
module.exports = router;