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


### Methods
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

