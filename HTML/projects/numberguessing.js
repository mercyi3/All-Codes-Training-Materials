const answer = Math.floor(Math.random()*10+1);
function check() {
    var you = document.getElementById("guess").value
        if(you < answer) {
            document.getElementById("answer").innerHTML = 
            "Nope!! Give the Greater Number";
        }
        else if(you > answer){
            document.getElementById("answer").innerHTML = 
            "Nope!! Give the Smaller Number";
        }
        else {  
            document.getElementById("answer").innerHTML = 
            "Congradulations You won the Game";
        }
}
function empty() {
    document.getElementById("answer").innerHTML=" "
}
