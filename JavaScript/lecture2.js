//Arithmetic operatoe
let a=5;
let b=4;
console.log("a =",a);
console.log("b= ",b);
console.log("a + b =",a+b);
console.log("a - b =",a-b);
console.log("a * b =",a*b);
console.log("a / b =",a/b);
console.log("a % b =",a%b);
console.log("a**b = ",a**b);
 //unary operator - increment, decrement
a++; //post increment
 console.log("a++ = ",a);
 a--; //post decrement
 console.log("a-- = ",a);
 console.log("++a =",++a); //pre increment

 //comparison operators
 let x=5;
 let y=5;
 let z="5";
 let k=9;
console.log("x==y",x == y);
console.log("x!=y",x!=y);
console.log("x == z",x == z); //true
//sometime we dont want that string and can not be equal
//so we have more strict version which check both value and datatypes
console.log("x === z",x===z);  //false
console.log("x !== z",x!==z);  //true
console.log("x >= k",x>=k);
console.log("x <= k",x<=k);

//logical operator
//evaluate multiple expression and it returns either true or false
let s=6;
let t=5;
//logical and -> when both condition are true then it returns true
let cond1=s>t; //true
let cond2= s===6; //true
let cond3= s===t;  //false
console.log("cond1 && cond2 =",cond1 && cond2);  //true
console.log("cond1 && cond3 =",cond1 && cond3);  //false
console.log("cond1 && cond2 && cond3 =",cond1 && cond2 && cond3);  //false

//logical OR -> it simply returns true if one condition is true.
console.log("cond1 || cond3 =",cond1 || cond3);  //true

//logical NOT Operator -> it simply returns the opposite of the result
console.log("!(s>t)=",!(s>t));  //false

//conditional Statement
//if-statement
let age=25;
if(age>18){
    console.log("You can vote");
}
else{
    console.log("You can't vote");
}
//if statement
let mode="dark";
let color;
if(mode==="dark"){
    color="black";
}
if(mode==="white"){
    color="white";
}
console.log(color);

//if-else statement
if(mode==="dark"){
    color="black";
}
else{
    color="white";
}
console.log(color);
//else is always come with if.

//checking odd-even numbers
let n=10;
if(n%2==0){
    console.log("its a even number");
}
else{
    console.log("Its an odd number");
}
//syntax -> rule
//else-if statement
let age1=25;
if(age1<18){
    console.log("You are younger now..");
}
else if(age1>18 && age1<60){
    console.log("you are adult now");
}
else{
    console.log("You are a senior citizen now");
}

//if we have only one line 
let mode1="dark";
if(mode1==="dark") console.log(mode) //it never generate any error.

//Ternary Operator
// condition ? true output : false output
let result=age1 >= 18 ? "adult" : "not adult";
console.log(result);

//MDN Docs


//switch statement
const expr = 'Papayas';
switch (expr) {
  case 'Oranges':
    console.log('Oranges are $0.59 a pound.');
    break;
  case 'Mangoes':
  case 'Papayas':
    console.log('Mangoes and papayas are $2.79 a pound.');
    // Expected output: "Mangoes and papayas are $2.79 a pound."
    break;
  default:
    console.log(`Sorry, we are out of ${expr}.`);
}
//practice question 1
let number=prompt("Enter a number:");//prompt helps to take user input
if(number % 5==0){
    console.log("This number is multiplied by 5");
}
else{
    console.log("This number is not multiplied by 5")
}

//PRACTICE QUESTION 2
let score=90;
if(score>=80 && score<=100){
    console.log("A");
}
else if(score>=70 && score<=89){
    console.log("B");
}
else if(score>=60 && score<=69){
    console.log("C");
}
else if(score>=50 && score<=59){
    console.log("D");
}
else if(score>=0 && score<=49){
    console.log("F");
}
else{
    console.log("Please Enter a valid score...!");
}