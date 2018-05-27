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

//Takes an array as an argument and returns true
//if all elements in the array are identical
function isUniform(array){
	var val=array[0];
	for(var i=0;i<array.length;i++){
		if(val==array[i])
			continue;
		else
			return false;
	}
	return true;
}

function sumArray(array){
	var sum=0;
	for(var i=0;i<array.length;i++)
		sum+=array[i];
	return sum;
}

//Takes an array as an arguments and pritns out the
// elements in the array in reverse order
function printReverse(array){
	for(var i=array.length-1;i>=0;i--){
		console.log(array[i]);
	}
}

// printReverse([1,2,3,4,5,6]);
console.log(sumArray([1,2,3,4,5,6]));
console.log(sumArray([1,1,1,1,1,1]));

// var number= prompt("Enter a number");
// var fact=factorial(number);
// console.log(fact);
// var string= "My-Name-is-shubham_aAgarwal";
// kebabToSnake(string);
