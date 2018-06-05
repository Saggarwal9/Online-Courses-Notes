### This Keyword

 1) Global Context
<pre>
console.log(this) -> refers to the window object. Every variable you declare is part of the window object.
var x; //this is window.x or this.x
</pre>

2) Implicit Context  
<pre>
var person= {
  firstName: "Shubham",
  sayHi: function(){
    return this.firstName; //returns shubham
  },
  dog: {
    sayHello: function(){
      return this.firstName; //returns Undefined because first name isn't defined in the scope of dog
    }
  }
}
</pre>

3) Explicit Binding
call(), apply(), bind() can only be applied to function which manipulates this.  
a) call()
<pre>
//Refer to the implicit context code
person.dog.sayHello.call(Person) // returns shubham

//Another example
var person= {
  firstName: "Shubham",
  sayHi: function(){
    return this.firstName; //returns shubham
  }
}

var person2={
  firstName: "Shaun"
}

person.sayHi.call(person2)//returns shaun
</pre>

b) Apply() is just like call, but we give the argument as an array.  

c) Bind()
<pre>
var person= {
  firstName: "Shubham",
  sayHi: function(){
    return this.firstName; //returns shubham
  }
  addNumbers:function(a,b,c,d){
    return a+b+c+d;
  }
}

var person2={
  firstName: "Shaun"
}

var person2Calc=person.addNumbers.bind(shaun,1,2,3,4);
person2Calc();//returns 1+2+3+4;
var person2Calc2=person.addNumbers.bind(shaun); //returns partial function
person2Calc2(1,2,3,4); //returns 1+2+3+4
</pre>

### Strict mode
Stops us from accidentally creating global variables for undefined variables.
<pre>
//Starting of the code
"use strict"
</pre>

### Object Oriented Programming
Javascript does not have in-built class support, we can use functions and objects.  

<pre>
function House(bedrooms,bathrooms,numSqft){ //naming convention for constructor function to have first char uppercase
  this.bedrooms=bedrooms;
  ....
  ...
}

var firstHouse= house(a,b,c); //firstHouse here would be undefined since we're not returning anything. To fix this, we use new.
var firstHouse = new house(a,b,c);
</pre>

What does the new object do?  
a) First creates an empty object  
b) It then sets the keyword 'this' to be that empty object.  
c) It adds the line 'return this' to the end of the function, which follows it.
d) It adds a property onto the empty object called "__proto__",  //Dunder proto
which links the prototype property on the constructor function to the empty object.  

<pre>
function Dog(name,age){
	this.name=name;
	this.age=age;
	
	this.bark=function(){
		console.log(this.name+ " just barked!");
    };
}
</pre>

#### Multiple Constructors
<pre>
function Car(make,model,year){
	this.make=make;
	....
	....
}

function Motorcycle(make,model,year){
	Car.call(this,make,model,year); //this relates to the Motorcycle object, else this from Car will relate to car objects.
	//OR
	Car.call(this,[make,model,year]); //Car.call(this,arguments);
	this.numwheels=2;
}
</pre>

### Prototypes
Every constructor function has a property on it called "prototype" which is an object.  
The prototype object has a property on it called "constructor", which points back to the constructor function.  
Anytime an object is created using the 'new' keyword,  property called "__proto__" gets created, linking the object  
and the prototype property of the constructor
<pre>
var arr= []; //[] = new Array
var shubham=new Person("Shubham);
Person.prototype.isInstructor=false;
shubham.isInstructor //will return false unless explicitly set --> inheritance
//Rather than declaring methods inside classes, we can just do

Function Person(name){
	this.....
}

//This saves space, as allocating space for function for each object would be alot,
//Rather have the objects have access to a single function.
Person.prototype.sayHi= function(){

}
</pre>

### Closures
We have to return the inner function for this function to work.
<pre>
function outer(a){
	return function inner(b){
		return a+b;
	}
}
outer(5)(5)//10
var storeOuter=outer(5)
storeOuter(10) //15
</pre>
We can either call the inner function right away by using an extra () or we can store the result of the  
function in a variable.  
We do not have to name the inner function.  
Closures are usually used to mimick private variables.
<pre>
function counter(){
	var count = 0;
	return function(){
		return ++count;
	}
}
var c= counter();
c(); //1
c(); //2...
//No one can access the count variable.
</pre>
