let name='Shawn';
let age=27;
name=true;
const max=101;

console.log(max);
let num=10;
num++;
console.log(--num);

let var1 = 9;
let var2 = 9;
 
// Equal ===
console.log(var1 === var2);
 
// Not Equal !=
console.log(var1 != var2);
 
// Greater than >
console.log(var1 > var2);
 
// Less than <
console.log(var1 < var2);
 
// Greater than or equal to >=
console.log(var1 >= var2);
 
// Less than or equal to <=
console.log(var1 <= var2);

/*

 
let result = (num1 < num2) ? "yay" : "nay";
console.log(result);
let num1 = 100;
let num2 = 1000;
if(num1>num2)
    console.log('num1 is greater!');
else if(num2>num1)
    console.log('num2 is greater!');
else
    console.log('num1 is same as num2');
    */
    for (var i = 1000; i <= 100; i += 2)
    {
        console.log("This is position for I: " + i);
    }
     
    var j = 10;
     
    while (j <= 100)
    {
        console.log("This is position for J: " + j);
        j += 2;
    }
     
    var k = 10;
     
    do
    {
        console.log("This is position for K: " + k);
        k += 2;
    } while (k <= 100)