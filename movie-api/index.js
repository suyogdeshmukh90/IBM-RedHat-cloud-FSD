const mongoose = require('mongoose');
const genres = require('./routes/genre');
const customers = require('./routes/customer');
const movies= require('./routes/movie');
const express = require('express');
const app = express();

mongoose.connect('mongodb://localhost/vidly')
  .then(() => console.log('Connected to MongoDB...'))
  .catch(err => console.error('Could not connect to MongoDB...'));

app.use(express.json());
app.use('/api/genres', genres);
app.use('/api/customers', customers);
app.use('/api/movies',movies);


app.listen(3000);