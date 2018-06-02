//Cleaning of code required, a lot of redundant code. 

var colors=generateRandomColors(numberOfColors)
var squares= document.querySelectorAll(".square"); 
var pickedColor = pickColor() 
var colorDisplay=document.getElementById("colorDisplay");
var messageDisplay=document.getElementById("message");
var resetButton = document.querySelector("#reset");
var h1=document.querySelector("h1");
var easy=document.querySelector("#easy");
var hard=document.querySelector("#hard");

easy.addEventListener("click",function(){
	numberOfColors=3;
	easy.classList.add("selected");
	hard.classList.remove("selected");
	reset();
	for(var i=3;i<squares.length;i++){
		//squares[i].style.backgroundColor="#232323";
		//OR
		squares[i].style.display="none";
	}

});

hard.addEventListener("click",function(){
	hard.classList.add("selected");
	easy.classList.remove("selected");
	numberOfColors=6;
	reset();
		for(var i=3;i<squares.length;i++){
		//squares[i].style.backgroundColor="#232323";
		//OR
		squares[i].style.display="block";
	}
})

function reset(){
	colors=generateRandomColors(numberOfColors);
	pickedColor=pickColor();
	colorDisplay.textContent=pickedColor;
	for(var i=0;i<squares.length;i++){
	//Add initial colors to squares
		squares[i].style.backgroundColor=colors[i]; //Not all browser support style.background so use backgroundColor
	}
	resetButton.textContent="New Colors"
	h1.style.backgroundColor="steelblue";
	messageDisplay.textContent="";
}

resetButton.addEventListener("click",reset);
colorDisplay.textContent=pickedColor;

for(var i=0;i<squares.length;i++){
	//Add initial colors to squares
	squares[i].style.backgroundColor=colors[i]; //Not all browser support style.background so use backgroundColor

	//add click listeners to squares
	squares[i].addEventListener("click",function(){
		if(this.style.backgroundColor==pickedColor){
			changeColors(pickedColor)
			messageDisplay.textContent="You won."
			h1.style.backgroundColor=pickedColor;
			resetButton.textContent="Play again?"
		}
		else{
			this.style.backgroundColor="#232323"
			messageDisplay.textContent="Try Again."
		}
	});
}

function changeColors(color){
	for(var i=0;i<squares.length;i++){
		squares[i].style.backgroundColor=color; //Not all browser support style.background so use backgroundColor
	}
}

function pickColor(){
	return colors[Math.floor(Math.random()*colors.length)];
}

function generateRandomColors(arg){
	var arr=[];
	for(var i=0;i<arg;i++){
		var r=Math.floor(Math.random()*256);
		var g=Math.floor(Math.random()*256);
		var b=Math.floor(Math.random()*256);
		arr[i]="rgb(" + r + ", " + g + ", " + b + ")";
	}
	return arr;
}