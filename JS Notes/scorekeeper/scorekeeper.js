var playerOne=document.querySelectorAll("button")[0];
var playerTwo=document.querySelectorAll("button")[1];
var reset=document.querySelectorAll("button")[2];
var input=document.querySelector("input");
var playerOneScore= 0;
var playerTwoScore= 0;
var winningScore=5; //default
var p1=document.querySelector("#p1");
var p2=document.querySelector("#p2");
var winningScoreSpan=document.querySelector("p span");
var gameOver=false;
var winner=-1;


playerOne.addEventListener("click",function(){
	if(!gameOver)
		p1.textContent=++playerOneScore;
	if(playerOneScore==winningScore){
		gameOver=true;
		p1.classList.add("winner");
		winner=1;
	}
});

playerTwo.addEventListener("click",function(){
	if(!gameOver)
		p2.textContent=++playerTwoScore;
	if(playerTwoScore==winningScore){
		gameOver=true;
		p2.classList.add("winner");
		winner=2;
	}
});

input.addEventListener("change",function(){
	winningScore= input.value;
	if(input.value<0)
		input.value=0;
	winningScoreSpan.textContent=winningScore;
	
});

reset.addEventListener("click",function(){
	playerOneScore=0;
	playerTwoScore=0;
	p1.textContent=0;
	p2.textContent=0;
	gameOver=!gameOver;
	if(winner===1)
		p1.classList.remove("winner");
	else
		p2.classList.remove("winner");

});