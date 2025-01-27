//Attribute
/*
let div=document.querySelector("div");
console.log(div);

let id=div.getAttribute("id");
console.log(id);  //box

let name=div.getAttribute("name");
console.log(name);  //js-div

let para=document.querySelector("p");
console.log(para);

let className=para.getAttribute("class");
console.log(className); //para

//set attribute
//setAttribute(attr,value)
para.setAttribute("class","paragraph"); 
console.log(para.getAttribute("class"));

//style
let div1=document.querySelector("div");
console.log(div1);
console.log(div1.style); //shows all inline styles
div1.style.backgroundColor="green";
div1.style.backgroundColor="purple";
div1.style.color="white";
div1.style.fontSize="20px";
//div1.innerText="Hello";
// div1.style.visibility="hidden";

//Add element using js
//its a two step process-first create then add
let newBtn=document.createElement("button");
console.log(newBtn); //<button></button>
newBtn.innerText="Click Me";
//to show this in html page we use this
//node.append(el)->adds at the end of the node(inside)
let div2=document.querySelector("div");
div2.append(newBtn);
div2.style.height="250px";
div2.style.width="150px";

//prepend->adds at the start of node(inside)
div2.prepend(newBtn);

//before-adds before the node(outside)
div2.before(newBtn);

//after-adds after the node(outside)
div2.after(newBtn);

let newHeading=document.createElement("h1");
console.log(newHeading);
newHeading.innerHTML="<i>Welcome to Apna College</i>";

div2.before(newHeading);


//remove() -> delete the node
let para1=document.querySelector("p");
//para1.remove(); //it simply remove the paragraph

//appendchild() and removechild()->learn from MDN

//PRACTICE QUESTION
let button=document.createElement("button");
console.log(button);
//give it text
button.innerText="Hey,Click Me!";
//giving it style
button.style.backgroundColor="red";
button.style.color="white";
button.style.border="none";
button.style.height="2rem";
button.style.borderRadius="50%";
//insert the button as the element inside the body tag
let body=document.querySelector("body");
console.log(body);
body.prepend(button);
*/
//PRACTICE QUESTION 2
let content=document.querySelector("p");
console.log(content);
let att=content.getAttribute("class");
console.log(att); //content
//using classList
console.log(content.classList); //DOMTokenList ['content', value: 'content']
content.classList.add("newclass");
console.log(content.classList);  //DOMTokenList(2) ['content', 'newclass', value: 'content newclass']
content.classList.remove("newclass");
console.log(content.classList);//DOMTokenList ['content', value: 'content']
