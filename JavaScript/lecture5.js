//FUNCTIONS & METHODS ->it helps to avoid redundancy(same code for different times)
function myFunction(msg){
    console.log("Welcome to Apna College");
    console.log("We are learning js");
    console.log(msg);
}
myFunction("I love javaScript");


//using the return keyword,its a reserve keyword in js
function sum(a,b){
    s=a+b; //local variable->scope
    console.log("before return")
    return s;
    console.log("after return") //once we write the return statement in a function no other lines got executed.
}
let val=sum(1,2);
console.log(val);

//Arrow Function
/*
const functionName=(param1,param2,...)=>{
    do some work    
}
    arrw function are the part of modern js
*/
//sum function
const arrowSum=(a,b)=>{
    console.log(a+b);
};
arrowSum(2,4);  //6

//multiplication function
const arrowMul=(a,b)=>{
    console.log(a*b);
};
arrowMul(4,5);  //20

//return
const arrowdiv=(a,b)=>{
    return a/b;
};
console.log(arrowdiv); //(a,b)=>{
                    //return a/b;
                    // }
console.log(arrowdiv(10,2));  //5

const printHello=()=>console.log("Hello");
printHello();  //Hello

//PRACTICE QUESTION
// let count=0;
// const func=(String)=>{
//     for(let i=0;i<String.length;i++){
//         let c = String.charAt(i);
//         if(c=="A" || c=="a" || c=="E" || c=="e"||c=="I"||c=="i"||c=="O"||c=="o"||c=="U"||c=="u"){
//             count++;
//         }
//     }
//     return count;
// }
// let str=prompt("Please enter a string-");
// console.log("Number of vowel present in a string is = ",func(str));

//forEach -> it is used when we want to perform something on every element of an array
//arr.forEach(callBackFunction)
let arr=[1,2,3,4,5];
arr.forEach(function printVal(val){
    //val at each index
    console.log(val);
})
/* output
1
2
3
4
5*/
 //in the form of arrow function
 arr.forEach((val)=>{
    console.log(val);
 });

 arr1=["Asansol","Mumbai","Chennai","Gurgaon","Mandarmani","Digha"];
 arr1.forEach((val)=>{
    let v = val.toUpperCase(); //it simply convert every element of an array into the uppercase.
    console.log(v); 
 });

 //along it using forEach by default print the each index position and the array itself
 arr1.forEach((val,idx,arr1)=>{
    let v = val.toUpperCase(); //it simply convert every element of an array into the uppercase.
    console.log(v,idx,arr1); 
 });
 /*
 ASANSOL 0 (6) ['Asansol', 'Mumbai', 'Chennai', 'Gurgaon', 'Mandarmani', 'Digha']
lecture5.js:92 MUMBAI 1 (6) ['Asansol', 'Mumbai', 'Chennai', 'Gurgaon', 'Mandarmani', 'Digha']
lecture5.js:92 CHENNAI 2 (6) ['Asansol', 'Mumbai', 'Chennai', 'Gurgaon', 'Mandarmani', 'Digha']
lecture5.js:92 GURGAON 3 (6) ['Asansol', 'Mumbai', 'Chennai', 'Gurgaon', 'Mandarmani', 'Digha']
lecture5.js:92 MANDARMANI 4 (6) ['Asansol', 'Mumbai', 'Chennai', 'Gurgaon', 'Mandarmani', 'Digha']
lecture5.js:92 DIGHA 5 (6) ['Asansol', 'Mumbai', 'Chennai', 'Gurgaon', 'Mandarmani', 'Digha']
*/

//Note: forEach is known as HIgher order Function or Higher Order Methods →
//Higher order Function is known as those function which takes other function as an parameter or it can return an function. 

//PRACTICE QUESTION 1
arrayList=[1,5,3,2,4,9];
arrayList.forEach((val)=>{
    console.log(val**2);
});


//Map->create a new array with the result of some operation, the values are callback returns
array=[1,2,3,4,5,6,7,8,9];
array.map((val)=>{
    console.log(val);
}); //it simply prints the array

let newArray=array.map((val)=>{
    return val; //it return the val and store into newArray,it simply make the copy of array
});
console.log(newArray);

//Filter method
//filter out all even no from a array
let arr11=[1,2,3,4,5,6,7,8,9,70,45,56,78,100];
let evenArray=arr11.filter((val)=>{
    return val%2==0;
});
console.log(evenArray);

//Reduce Method 
//perform some operation and reduce the array to a single value.it returns that single value.
let newArr=[1,2,3,4];
const output=newArr.reduce((result,current)=>{
    return result+current;
})
console.log(output);  //10

//find the largest
newarr=[2,6,3,4,7,8,22,10];
let op=newarr.reduce((prev,current)=>{
    return prev>current?prev:current;
});
console.log(op); //22
 
//PRACTICE QUESTION
let marksList=[90,34,56,99,98,56,92,67,91,100];
let highestMarks=marksList.filter((val)=>{
    if(val>90){
        return val;
    }
});
console.log(highestMarks); //(5) [99, 98, 92, 91, 100]

//PRACTICE QUESTION 2
let n=prompt("PLease Enter a Number-"); //5
let newArrayList=[];
for(let i=0;i<n;i++){
    newArrayList[i]=i+1;
}
console.log(newArrayList);  //(5) [1, 2, 3, 4, 5]
let sumOutput=newArrayList.reduce((prev,cur)=>{
    return prev+cur;
});
console.log(sumOutput);  //15
let product=newArrayList.reduce((prev,curr)=>{
    return prev*curr;
});
console.log(product);  //120