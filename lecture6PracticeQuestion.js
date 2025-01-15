let heading=document.querySelector("h2");
console.log(heading);
console.log(heading.innerText); //Hello JavaScript
console.log(heading.innerHTML);  //Hello JavaScript

heading.append(" From Apna College");
console.log(heading);
console.log(heading.innerText); //Hello JavaScript From Apna College

//second way is here we concat two strings
heading.innerText=heading.innerText + " Thanks For Joining";
console.log(heading.innerText); //Hello JavaScript From Apna College Thanks For Joining

//Practice Question 2
let box=document.querySelectorAll(".box");
console.log(box); //NodeList(3) [div.box, div.box, div.box]
console.log(box.innerText);
console.log(box[0]); //it works as an array,index 0 means it accessing the first div.
console.log(box[1]);
console.log(box[2]);

box[0].innerText="new div1";
console.log(box[0].innerText); //new div1
box[1].innerText="new div2";
console.log(box[1].innerText); //new div2
box[2].innerText="new div3";
console.log(box[2].innerText); //new div2


//second way to do this
let idx=1;
for(b of box){
    console.log(b);
    console.log(b.innerText);
    let print=b.innerText=`This is our div ${idx}`;
    idx++;
    console.log(print);
}




