//Arrays
let marks=[97,67,89,90];
console.log(marks);

console.log(marks.length); //property -> only give a value ->o/p=4

console.log(typeof(marks)); //object (in js)

//Array Indices
console.log(marks[0]);  //97
console.log(marks[6]);  //undefined

marks[2]=33;
console.log(marks); //[97, 67, 33, 90]

//Looping over an Array
for(let i=0;i<marks.length;i++){
    console.log(marks[i]);
}

//for of
for(let i of marks){
    console.log(i);
}
/*
97
67
33
90*/
let cities=["Asansol","burdwan","Durgapur","Burnpur","Andal"];
for(let element of cities){
    console.log(element);
    console.log(element.toUpperCase());
}

//PRACTICE QUESTION 2
let price_list=[250,645,300,900,50];
for(let i=0;i<price_list.length;i++){
    final_price=price_list[i]-(price_list[i]/10);
    price_list[i]=final_price;
}
console.log("Final price list is= ",price_list);

//Arrays Methods
//push()->add to end
//pop()->delete from end and return
//toString()-> converts array to String

let foodItems=["potato","Tomato","Apple","Pine Apple"];
foodItems.push("Cherry");
console.log(foodItems);
foodItems.push("paneer","Chat");
console.log(foodItems);

let deleted_item=foodItems.pop();
console.log(deleted_item);

console.log(foodItems.toString());

//concat method -> join multiple array and return new result
let marvelHero=["thor","spiderman","ironman"];
let dcHero=["superman","batman"];
let indianHero=["krish","Shaktiman"];
let hero=marvelHero.concat(dcHero);
let heros=marvelHero.concat(dcHero).concat(indianHero);
console.log(hero);
console.log(heros);

//unshift method-> add to start
marvelHero.unshift("antman");
console.log(marvelHero); // ['antman', 'thor', 'spiderman', 'ironman']

//shift -> delete the first element of the array and return it
marvelHero.shift();
console.log(marvelHero);  // ['thor', 'spiderman', 'ironman']

//slice()->returns a piece of the array
//slice(startindex,endindex)->it didn't change the original array

console.log(marvelHero.slice(1,3));
console.log(marvelHero.slice());

//splice method ->change the original array(add,remove,replace)
//splice(strtindex,delcount,newElement)
let marks_list=[56,90,43,78,95,89,90,100];
console.log(marks_list);  //(8) [56, 90, 43, 78, 95, 89, 90, 100]

//delete an element
marks_list.splice(3,2);
console.log(marks_list);  //(6) [56, 90, 43, 89, 90, 100]

//from a specific position first delete and then add
marks_list.splice(4,1,56,99,66);
console.log(marks_list);  //(8)[56, 90, 43, 89, 56, 99, 66, 100]

//add element from a specific position
marks_list.splice(2,0,12);
console.log(marks_list); //(9)[56, 90, 12, 43, 89, 56, 99, 66, 100]

//replece element
marks_list.splice(2,1,100);
console.log(marks_list); //(9) [56, 90, 100, 43, 89, 56, 99, 66, 100]

marks_list.splice(4); //it works as slice
console.log(marks_list);  //[56, 90, 100, 43]

//PRACTICE QUESTION
let companies=["Bloomberg","MIcrosoft","Uber","Google","IBM","Netflix"];
companies.shift();
console.log(companies); //(5) ['MIcrosoft', 'Uber', 'Google', 'IBM', 'Netflix']

companies.splice(1,1,"Ola");
console.log(companies);  //(5) ['MIcrosoft', 'Ola', 'Google', 'IBM', 'Netflix']

companies.push("Amazon");
console.log(companies);  //(6) ['MIcrosoft', 'Ola', 'Google', 'IBM', 'Netflix', 'Amazon']

