Variables are of dynamic type. We don't need to specific their type and can change them as per our requirements.    
Variables are initially undefined, and unless we **explicitly** mention it as null, to indicate it's empty.  

Some in-built methods: console.log() ,alert(), prompt(), clear().  
Number() is another method, it is like Integer.parseInt()

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

