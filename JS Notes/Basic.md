Variables are of dynamic type. We don't need to specific their type and can change them as per our requirements.    
Variables are initially undefined, and unless we **explicitly** mention it as null, to indicate it's empty.  

Some in-built methods: console.log() ,alert(), prompt(), clear().  
Number() is another method, it is like Integer.parseInt().
<string>.indexOf("yes") // is like substring. Returns -1 if they don't find the substring.
  <string>.slice(1) //Another function like substring, <string>.substring(1);


javascript files ends with .js
<pre>
  alert("Hello!");
</pre>
we can connect this to our HTML element by including
```html
<html>
<head>
  <title>Scruot Demo</title>
  <script src="name.js"></script>
</head>
</html>
```

## Control Flow

### Comparision Operators
Same as java, there is an additional === operator that compares the type and value. Corallaly, there is !==.  
x== "5" (Performs type coercion i.e. converting the value into a type that can be compared with x) is true but x === "5" false.  

We can compare Strings with x=="yes".  

### Turthy and Falsy Values
Values that aren't acxtually true or false, are still inherently "truthy" or "falsey" when evaluated in a boolean context.  
"hello" in console will return "hello", !"hello" will return false(falsey), !!"hello" will return true (truthy).  
Falsy Values: false, 0 , "" (empty string), null, undefined, NaN. 
Everything else is truthy.  

<pre>
var str="" //falsey
var msg= "haha!" //truthy
var isFunny = "false"//**truthy**
!((str||msg) && isFunny) is falsey
</pre>


## Methods
<pre>
function doSomething(num){
  console.log("Hello World");
  return num;
}
doSomething //Pritns the function definition and **not executes** it.
doSomething();
var value=doSomething(); //contains 139
</pre>

There are two types of syntax for methods. FUnction Declaration vs Function Expression.
<pre>
var capitalize=function(str){
  return str.charAt(0).toUpperCase() + str.slice(1);
}
capitalize()
capitalize = 134; //now we lose the code of the function.
</pre>

### Higher Order Functions
We can pass a function as an argument.  
<pre>
function sing(){
  console.log("Twinke Twinkle Little Stars");
  console.log("How I wonder what you are");
}

//setInterval(anotherFunc, interval in ms) - If you want to call the function every interval
setInterval(sing,1000); //Passing sing function --> Higher order function
</pre>
SetInterval returns a number, which can be used to stop the itnervals using clearInterval(<setInterval return num>)  
<pre>
clearInterval(2);
</pre>

### Anonymous Functions
<pre>
setInterval(function(){
  console.log("Twinke twinke...");
},2000);
</pre>

## Data Structures
### Arrays
Empty spaces are filled by undefined. Arrays can take in any type of data (Doesn't have to be of one type).  
<pre>
var friends= ["Charlie", "Liz", "David", "Mattias"];
friends.length //4
//OR
var friends = new Array(); //uncommon
//OR
var friends = [];
</pre>

#### Arrays in-built methods
**Push and Pop**  
<pre>
var colors=["red","orange","yellow"];
colors.push("green"); //Adds at end
var lastColor=colors.pop(); //Returns and removes the last element
</pre>

**Shift and Unshift**  
Opposite to push and pop, adds/remove in the front.
<pre>
colors.unshift("infrared"); //adds infrared in front
colors.shift(); //removes infrared.
</pre>

**indexOf()**
returns the index of the data if found in the array.  
colors.indexOf("orange"); //returns 1  

**slice()**  
use slice() to copy entire/parts of an array.
<pre>
var nums = [1,2,3,4,5,6,7];
var slicednums=nums.slice(1,4);//returns slicednums=[2,3,4]
var slicednums=nums.slice(); //returns a copy of the original array.
</pre>

**splice()**
todos.splice(index,num); //deletes **num** number of elements from index **index** in an array.   

### ForEach
JavaScript provides an easy built-in way of iterating voer an array: ForEach.
<pre>
var colors= ["red","orange","yellow","green"];
colors.forEach(function(eachColor){ //eachColor is a placeholder name to refer to all the objects inside the array.
console.log("My favorite color is " + eachColor);
}); //Will print My favorite color is red. My favorite color is orange......

We can even give pass a function.
colors.forEach(<function name>) like colors.forEach(printColor);
</pre>

More documentation:  
<pre>
.forEach takes a callback function, that callback function is expected to have at least 1, but up to 3, arguments. This is how .forEach was designed.
The arguments are in a specific order:
- The first one represents each element in the array (per loop iteration) that .forEach was called on.
- The second represents the index of said element.
- The third represents the array that .forEach was called on (it will be the same for every iteration of the loop).
</pre>


## Object
<pre>
  var person = {
    name: "Cindy",
    age: 32,
    city: "Missoula"
    add: function(x,y){
      return x+y;
    }
  };
  console.log(person.name); //Cannot use dot notation if property starts with a number/has space
  //or
  console.log(person["name"];
  person.add(10,5)
  
  Another differnce:
  var str="name";
  someObject.str //doesn't look for name
  someObject\[str\] //does evaluate str and looks for "name"
</pre>
**Note:** the object definiton has "," after every member.  

### Arrays of Object
<pre>
var posts= [
  {
    title: "Cats are mediocre",
    author: "Colt"
  },
  {
  title: "Cats are awesome",
  author: "Not colt"
  }
]
</pre>

