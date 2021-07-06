const mongoose=require('mongoose');
const todos=require('./routes/todo');
const express=require('express');
const app=express();

app.use(express.json());
app.use('/todos',todos);

mongoose.connect('mongodb://localhost:27017/todo',{ useNewUrlParser: true }, { useUnifiedTopology: true })
.then(() => console.log('Connected to MongoDB...'))
.catch(err => console.error('Could not connect to MongoDB...'));

app.listen(4000,()=>{
    console.log('Server started...')
});