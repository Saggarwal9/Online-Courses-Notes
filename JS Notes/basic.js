//File with some of my functions to practise javascript.

function factorial(num){
	if(num==0)
		return 1;
	return Number(num)*factorial(num-1);
}

//function to replace a single kebab-cased string argument
//and returns the snake-cased version. Basically, replace
//"-"s with "_"s.
function kebabToSnake(string){
	console.log(string.replace(/-/g,"_"));
}

// var number= prompt("Enter a number");
// var fact=factorial(number);
// console.log(fact);
var string= "My-Name-is-shubham_aAgarwal";
kebabToSnake(string);
