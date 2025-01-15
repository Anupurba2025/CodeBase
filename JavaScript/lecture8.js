//EVENT LISTENER
//change in the state of an object is known as an Event
// let btn1=document.querySelector("#btn1");
// btn1.onclick=()=>{
//     console.log("Btn1 was clicked");
//     let a=25;
//     a++;
//     console.log(a);
// }
// let div=document.querySelector("div");
// div.onmouseover=()=>{
//     console.log("You are inside the div");
// }

//if we handle the events at inline and also in the js file at the same time then the priority should always given to js event handling one.
//if we define the same event handler for more than once then before codes are overwritten and last one will executed
// let div=document.querySelector("div");
// div.onmouseover=()=>{
//     console.log("part1"); //this will not overwritten by the last on eand not get executed.
// }
// let div=document.querySelector("div");
// div.onmouseover=()=>{
//     console.log("part 2"); //this code will execute

// }


//Event Object ->it's a special type of object which has all details about events
// let btn1=document.querySelector("#btn1");
// btn1.onclick=(e)=>{
//     console.log(e);//PointerEvent {isTrusted: true, pointerId: 1, width: 1, height: 1, pressure: 0, …}
//     console.log(e.type); //click
//     console.log(e.target);
//     console.log(e.clientX,e.clientY);//35 23
// } 
// let div=document.querySelector("div");
// div.onmouseover=(event)=>{
//     console.log(event);//MouseEvent {isTrusted: true, screenX: 110, screenY: 144, clientX: 105, clientY: 65, …}
//     console.log(event.type);//mouseover
//     console.log(event.target);
//     console.log(event.clientX,event.clientY);//105 65
// }

//Event Listener
//for a single event we can use multiple eventListener
//callback is also known as handler

// let btn1=document.querySelector("#btn1");
// btn1.addEventListener("click",()=>{
//     console.log("button was clicked-handler 1");
// });
// btn1.addEventListener("click",(event)=>{
//     console.log("button was clicked-handler 2");
//     console.log(event);
//     console.log(event.type);
//     console.log(event.clientX,event.clientY);
// });
// const handler3=btn1.addEventListener("click",()=>{
//     console.log("button was clicked-handler 3");
// });
// btn1.addEventListener("click",()=>{
//     console.log("button was clicked-handler 4");
// });

// btn1.removeEventListener("click",handler3);

//Practice Question
let mode=document.querySelector("#mode");
mode.addEventListener("change",(event)=>{
    console.log(event.type); //change
    console.log(event.target);
    if(event.target.checked){
        document.body.classList.add('darkMode');
        document.body.classList.remove('lightMode');
        console.log(document.body.classList);
    }
    else{
        document.body.classList.add('lightMode');
        document.body.classList.remove('darkMode');
        console.log(document.body.classList);
    }


});