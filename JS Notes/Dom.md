Javascript meets HTML+CSS -> Document Object Model.  
-> We load HTML in the browser.  
-> The browser turns every HTMl tag into a javacript object that we can manipulate.  
-> Everything is stored inside of the document object.  

We can select one of the data members and manipulate it. 
<pre>
//Function to change the color of the body of the webpage every 1 second.
var body = document.querySelector("body");
var isBlue = false;

setInterval(function(){
  if(!isBlue){
    body.style.background = "white";
  }else{
    body.style.background = "blue";
  }
  isBlue=!isBlue;
},1000);
</pre>

## Selection
5 Main methods:
<pre>
document.getElementById()
document.getElementsByClassName()
document.getElementsByTagName()
document.querySelector()
document.querySelectorAll()
</pre>

For Example: 
```html
<html>
  <head></head>
  <body>
    <h1> Hello </h1>
    <h1> Goodbye </h1>
  <ul>
  <li id="highlight">List Item 1</li>
  <li class="bolded">List Item 2</li>
  <li class="bolded">List Item 3</li>
  </ul>
  </body>
</html>
```
We can use different properties to select different elements in different combinations.
<pre>
getElementById("highlight"); will select the first li
var tags=getElementByClassName("bolded"); //returns a node list and not an array.
console.log(tags[0]);
var tags= document.getElementsByTagName("li"); //will return the list of all 3 LI's
</pre>

Query selector is a new method that can match a given CSS-style selector.
<pre>
var tag=document.querySelector(".bolded"); //Always return one element (the first one)
var tag= document.querySelector("h1"); //can also take tag names/ID but returns the first one. 
//you can also select all anchor tags under all li's
var li=document.querySelector("li a.special"); //All anchor tags have class special.
var tags = document.querySelectorALl(".bolded"); //will return all the elements that matches the description 
//(even if there's only one)
</pre>
