const path=require('path');
const express=require('express');
const app=express();
const router=express.Router();
const bodyParser=require('body-parser');

app.use(bodyParser.urlencoded({extended:false}))

router.get('/',(req,res,next)=>{
    res.sendFile(path.join(__dirname,'../','views','soccer.html'));
});

module.exports=router;