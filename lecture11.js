//direct way of creating an object
const student={
    fullName:"Anupurba Kha", //states
    marks:95.9, //states
    printMarks:function(){
        console.log("marks=",this.marks);//this.marks is eqivalent to student.marks
    }, //methods
};
console.log(student); //{fullName: 'Anupurba Kha', marks: 95.9, printMarks: ƒ}
console.log(student.fullName);
console.log(student.printMarks());
console.log(student.toString);

const emp={
    calTax1(){
        console.log("tax rate is 10 %");
    },
    calTax2:function(){
        console.log("tax rate is 20 %"); //both of the way are the right way
    },
};
//output-
//{calTax1: ƒ, calTax2: ƒ}

const karanArjun = {
    salary:50000, 
};
const karanArjun1 = {
    salary:50000, 
};
const karanArjun2 = {
    salary:50000, 
};
// __proto__ is baSICALLY USED TO SET THE PROTOTYPE
//Basically when we want to use other objects function into new object we set the prototype
karanArjun.__proto__ = emp;
karanArjun1.__proto__ = emp;
karanArjun2.__proto__ = emp;
//output
//{salary: 50000}
//  salary: 50000
//  [[Prototype]]: Object
//    calTax1: ƒ calTax1()
//    calTax2: ƒ ()
//    [[Prototype]]: Object

console.log(karanArjun.calTax1()); //tax rate is 10 %
console.log(karanArjun.calTax2());  //tax rate is 20 %
console.log(karanArjun1.calTax2());
console.log(karanArjun2.calTax2());


const Anu ={
    salary: 100000,
    calTax1(){
        console.log("Tax rate is 33 %");
    }
};
Anu.__proto__ = emp;

//if object & prototype have the same method, object's method will used
console.log(Anu.calTax1()); //Tax rate is 33 %
console.log(Anu.calTax2()); //Tax rate is 33 %

//classes in js
class toyotaCar{
    start(){
        console.log("start");
    }
    stop(){
        console.log("stop");
    }
    setBrand(brand){
        this.brandName=brand; //this keyword is used  to set the brandname for individual car brands;
        //we can use the same name for variable ( brandName) and parameter (brand), still both works as different purpose and code runs well without an error
    }
}
//creating an object with the help of a class
let fortuner = new toyotaCar();
fortuner.setBrand("Fortuner");
let lexus = new toyotaCar();

console.log(fortuner);
//toyotaCar {brandName: 'Fortuner'}
//  brandName: "Fortuner"
//  [[Prototype]]: Object
//     ->constructor: class toyotaCar
//     ->setBrand: ƒ setBrand(brand)
//     ->start: ƒ start()
//     ->stop: ƒ stop()
//     ->[[Prototype]]: Object

console.log(fortuner.start()); //start
console.log(fortuner.stop()); //stop

//custom constructor
class car{
    constructor(brand){
        console.log("new object is created");
        this.brand=brand; // it helps to initialize its brand name
    } // it was invoked when we initialized object for the first time with the help pof class name using new keyword.
    start(){
        console.log("it was started");
    }
    stop(){
        console.log("it was stopped");
    }
}
let maruti = new car("Maruti"); //new object is created
console.log(maruti);//car {brand: 'Maruti'}

let suzuki = new car("Suzuki"); //new object is created
console.log(suzuki); //car {brand: 'Suzuki'}

console.log(maruti.start()); //it was started

let kiya = new car(); //if we do not pass paramete it didn't show any error, it simply prints undefined in the place of brand;
console.log(kiya); //car {brand: undefined
//kiya.brand="Kiya"; //log
console.log(kiya);

//INHERITANCE
class Parent{
    hello(){
        console.log("hello");
    }
}
class child extends Parent{

}
let obj= new child();
console.log(obj.hello()); //hello

class person{
    eat(){
        console.log("eat");
    }
    sleep(){
        console.log("sleep");
    }
}
class Engineer extends person{
    work(){
        console.log("solve problem,build solution");
    }
}
let AnuObj = new Engineer();
console.log(AnuObj);
console.log(AnuObj.eat()); //eat
console.log(AnuObj.sleep()); //sleep
console.log(AnuObj.work()); //solve problem,build solution

class Person{
    constructor(){
        this.species="homo Sapience";
    }
    eat(){
        console.log("A person can eat thrice a day");
    }
    sleep(){
        console.log("A person need to sleep minimum 5 hours at night");
    }
    work(){
        console.log("do nothing");
    }
}
class Doctor extends Person{
    work(){
        console.log("His work is to treat a patient !");
    }
}
let AyushObj = new Doctor();
console.log(AyushObj.eat());//A person can eat thrice a day
console.log(AyushObj.work()); //His work is to treat a patient !


let p1=new Person();
console.log(p1); //Person {species: 'homo Sapience'}

let d1 = new Doctor();
console.log(d1); //Doctor {species: 'homo Sapience'}


//super keyword
class Persons{
    constructor(name){
        console.log("Enter to the Parent constructor");
        this.species="homo sapience";
        this.name=name;
    }
    eat(){
        console.log("A person can eat food");
    }
}
class Engineers extends Persons{
    constructor(branch,name){
        console.log("Enter to the child constructor");
        super(name); // to invoke parent class constructor
        //if we do not use the super keyword it will throw an error
        this.branch=branch;
        console.log("Exit the child constructor");
    }
    work(){
        super.eat();
        console.log("he builds solution to the real world problems...");
    }
}
let enObj = new Engineers("AIML Engineer","Anu");
console.log(enObj); //Engineers {species: 'homo sapience', branch: 'AIML Engineer'}
console.log(enObj.eat()); //A person can eat food


//practice question
let DATA = "Secret Information";

class User{
    constructor(name,email){
        this.name=name;
        this.email=email;
    }
    viewData(){
        console.log("Data is= ",DATA);
    }
}
let student1 = new User("Anu","anu@gmail.com");
let student2 = new User("Ranu","Ranu@gmail.com");

let teacher1=new User("shradha","dean@gmail.com");

console.log(student1); //User {name: 'Anu', email: 'anu@gmail.com'}
console.log(student1.viewData()); //Data is=  Secret Information

class Admin extends User{
    editData(){
        DATA="some new value";
    }
}
let admin1=new Admin("Purba","p@gmail.com");
console.log(admin1);
console.log(admin1.editData());
console.log(admin1.viewData());

