
// Disable right-click
// document.addEventListener('contextmenu', function(event) {
// event.preventDefault(); 
// });

const loginPopup1 = document.querySelector(".first-pop");
const loginPopup2 = document.querySelector(".second-pop")
const close1 = document.querySelector(".first-close");
const close2 = document.querySelector(".second-close");
window.addEventListener("load",function(){
    showPopup1();
    showPopup2();
})
function showPopup1(){
    const timeLimit = 3 // seconds;
    let i=0;
    const timer = setInterval(function(){
    i++;
    if(i == timeLimit){
        clearInterval(timer);
        loginPopup1.classList.add("show");
    } 
    console.log(i)
    },1000);
}

function showPopup2(){
const timeLimit = 60 
let i=0;
const timer = setInterval(function(){
i++;
if(i == timeLimit){
    clearInterval(timer);
    loginPopup2.classList.add("show");
} 
console.log(i)
},1000);
}

close1.addEventListener("click",function(){
loginPopup1.classList.remove("show");
})
close2.addEventListener("click",function(){
loginPopup2.classList.remove("show");
})