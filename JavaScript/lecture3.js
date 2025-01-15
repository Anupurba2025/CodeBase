//loops -> execute a piece of code again and again
for(let i=1;i<=6;i++){
    console.log("apna college");
}
console.log("loop has ended");
//calculate sum of first n number
let sum=0;
for(let i=0;i<=100;i++){
    sum+=i;
}
console.log(sum);

for(var i=1;i<=6;i++){
    console.log("apna college");
}
console.log(i); //it prints 7

for(let j=1;j<=6;j++){
    console.log("apna college");
}
//console.log(j); //as we define the j as let, so out of the for block there is no existence of j
//to avoid error again we have to redeclare it.
let j=9;
console.log(j); //it prints 9

//while loop
let k=1;  //initialization
while(k<=10){  //condition
    console.log(k);
    k++ //updation
}
//do-while loop
do{
    console.log("hi");
    k++;
}while(k<=10);

//for-of loop and 
let str="ApnaCollege";
let size=0;
for(let i of str){
    console.log(i);
    size++;
}
console.log("length of the string is=",size);
//for-in
let student={
    name:"Rahul Kumar",
    cgpa:9.0,
    age:20,
    isPass:true,
};
for(let i in student){
    console.log(i);
}
for(key in student){
    console.log("key=",key,"value=",student[key]);
}

//practice question
for(let i=0;i<=100;i++){
    if(i%2==0){
        console.log(i);
    }
}

/*practice question 2
let m=10;
let p=0;
do{
    let n=prompt("please guess the number-");
    if(m==n){
        alert("yes,you guessed the right one at your");
        p=1;
    }
    else{
        alert("Ohhh...You are wrong");
    }
}while(p!=1);
*/

//string in js
//create a string
let string="Apna College"
let str1='Anupurba';
console.log(str1.length);
console.log(str1[3]); //p
console.log(str1[6]);

//Template Literals
let sentence=`This is a template literal`;
console.log(sentence);
console.log(typeof sentence); //string


let obj1={
    item:"pen",
    price:10,
};
console.log("the cost of",obj1.item," is",obj1.price," rs."); //the cost of pen  is 10

//using literals
let output=`the cost of ${obj1.item} is ${obj1.price} rupees`;
console.log(output);

//escape character(\n is a special escape character which helps to switch into second line)
console.log("Apna \n college");
console.log("apna \t college");//to create a tab 
let str11="Apna\tcollege";
console.log(str11.length); //12 ->  beacuse escape characgter take 1 space(11+1=12)

//string methods
//string has some in build methods which helps to do a specific block of work
let strr="Apna College";
console.log(strr.toUpperCase()); //APNA COLLEGE
console.log(strr); //Apna College
//console.log(strr); it never return all character in uppercase because this inbuild 
//methods never change the original strings.it only modify it into new string.

//if we want to change the  we have to store it
strr=strr.toUpperCase();
console.log(strr);

//all in lower case
console.log(strr.toLowerCase());

//trim method -> remove white space
let str12="   Apna   college   js  ";
console.log(str12); //....Apna   college   js....
console.log(str12.trim()); //Apna   college   js -> it remove .... this white space

//slice method
// str.slice(start,end?)
console.log(strr.slice(1,4)); //PNA
console.log(strr.slice(2)); //NA COLLEGE

//concat -> helps to join two string str1 and str2
let s1="Apna";
let s2="College";
console.log(s1.concat(s2)); //ApnaCollege
console.log(s1+s2); //ApnaCollege

//replace method
let string1="Hello";
console.log(string1.replace("H","y")); //yello
console.log(string1.replace("lo","p")); //Help

let string2="Helololo";
console.log(string2.replace("lo","p")); //Heplolo ->replacement took place for onece when it has its first math
console.log(string2.replaceAll("lo","p")); //Heppp ->it will replace all

//charAt()
let stri="Ilovejs";
console.log(stri.charAt(3)); //v

//practice question
let fullName=prompt("Please Enter Your Full Name-");
let userName;
userName="@".concat(fullName).concat(fullName.length);
console.log(userName);  //@Anupurba8

