const mongoose=require('mongoose');
const joi=require('joi');
const express=require('express');
const app=express();

mongoose.connect('mongodb://localhost/employee')
.then(()=>console.log('Connection Successfull'))
.catch(err => console.error('Could not connect to MongoDB...', err));

 
/*const courseSchema = new mongoose.Schema({
    name: String,
    author: String, 
    tags: [ String ],
    date: Date, 
    isPublished: Boolean,
    price: Number
  });
  const Course = mongoose.model('course', courseSchema);
 
async function getCourses() {
  return await Course
  .find();
}*/
 const employeeSchema = new mongoose.Schema({
     firstName: String,
     lastName: String,
     salary: Number
 });
const Employee=mongoose.model('employee',employeeSchema);
const { error } = validateEmployee(Employee); 
if (error) 
  console.log(error.details[0].message);

async function getEmployee(){
    return await Employee.find();
}

 function validateEmployee(employee)
{
  const schema=
  {
    firstName:joi.string().min(3).required(),
    lastName:joi.string().min(3).required(),
    salary:joi.number().min(27000).required()

  };
  return joi.validate(employee,schema);
}
async function createEmployee(firstName, lastName, salary) { 
  const employee = new Employee({
   firstName,
   lastName,
   salary
  });
 
  const { error } = validateEmployee(employee); 
  if (error) 
  console.log(error.details[0].message);
  const result = await employee.save();
  console.log(result);
}

async function run() {
    // const courses = await getCourses();
    // console.log(courses);

    const employees=await getEmployee();
    console.log(employees);
  }
  
  // createEmployee('arnold','coffman',31000);
   run();
