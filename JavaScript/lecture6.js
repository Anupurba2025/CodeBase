//DOM
console.log("hello"); //hello
window.console.log("hello1");//hello1

console.log(window.document);  //it simply shows the whole html code
console.dir(window.document); //it shows the all directories
//console.log helps to print the object as an element  console.
//console.dir helps to print the properties and methods of an special object type file such as document
//window->document(a model which has the access to html,styleshhets)->dom
console.dir(window);
console.dir(document);
console.dir(document.body);
console.log(document.head);
console.dir(document.body.childNodes);
console.dir(document.body.childNodes[1]);

//document.body.style.background="green";
//if we write this in console it simply changes the background color into green and it does dynamically

//DOM Manipulation
//get element by ID
// let header=document.getElementById("heading");
// console.log(header);


//get element by class name
let headings=document.getElementsByClassName("heading");
console.dir(headings);
console.log(headings);

//selection with tag
let para=document.getElementsByTagName("p");
console.dir(para);
console.log(para);

//query selector
let element=document.querySelector("p");
console.dir(element); //it returns the first element related to this tag

//if we want all element related to this tag then we used like below
let elements=document.querySelectorAll("p");
console.dir(elements); //it returns all matching tag elements
//it returns the nodeList

//if we search based on id
let buttons=document.querySelector("#myId");
console.dir(buttons); 

//if we search based on class
//for accessing the first element related to this class
let list=document.querySelector(".heading");
console.dir(list); //it returns h1.heading

//for accesing all the elements related to this class
let lists=document.querySelectorAll(".heading");
console.dir(lists);  //it returns NodeList(2)


//Properties
//we can get, set, change/update
//tagname->return the tag name
console.log(list.tagName); //H1

//innerText->return thr text contentof the element and all its children
console.dir(document.body.firstChild); //#text
console.dir(document.body.lastChild); //script
console.dir(document.querySelector("body").children); //HTMLCollection(7)

//we used this for navigation,for move towards next level from thr upper one

//innerText
let div=document.querySelector("div");
console.log(div.innerText);  //it shows purely text formats
// Fruits
// Apple
// Orange
// Cherry
// Pine-Apple
// Banana
// Mango
console.log(div.innerHTML); //it shows the html information
/*<h3>Fruits</h3>
        <ul>
            <li>Apple</li>
            <li>Orange</li>
            <li>Cherry</li>
            <li>Pine-Apple</li>
            <li>Banana</li>
            <li>Mango</li>
        </ul>*/
div.innerText="Anupurba";
console.log(div.innerText); //Anupurba
console.log(div.innerHTML); //Anupurba

div.innerHTML="<div>inner div</div>";
console.log(div.innerHTML); //<div>inner div</div>
console.log(div.innerText); //inner div
//here dynamically we can change html or text in run time.

div.innerHTML="<div>inner div<h1>new heading</h1></div>";
console.log(div.innerHTML); //<div>inner div<h1>new heading</h1></div>

//textContent -> it also shows the hidden elements of an html file too
let heading1=document.querySelector("h1");
console.log(heading1);  //HTMLCollection(2) [h1.heading, h1]
console.log(heading1.innerText); //undefined
console.log(heading1.textContent);

