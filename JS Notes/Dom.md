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

**textContent** returns the string of all the text contained in a given element.
``` html
<p>
  This is an <strong> awesome <strong>paragraph.
</p>
```
<pre>
  var tag=document.querySelector("p");
  tag.textContent;// "This is an awesome paragraph"
  tag.textContent="hello"; //alters the textContent
</pre>

But this will get rid of the strong tag.  
**innerHtml** is another method that returns the string with the HTML tags. We can erven get the HTML of the whole body by 
<pre>
document.body.innerHTML
//Also we can maintain the string format
document.body.innerHTML="<strong> Hello </strong>"; 
</pre>
  
## Manipulation
<pre>
//Select
var tag = document.getElementById("highlight");
//Manipulate
tag.style.color="blue";
tag.style.border = "10px solid red";
tag.style.fontSize = "70px";
....

</pre>

Rather than directly manipulating style with JavaScript, we can define a CSS class and then toggle it on or off with JS.  
ClassList- A read-only list that contains the classes for a given element. It is **not an array**
<pre>
.some-class{
  color: purple;
  fontSize: 76px;
}

var tag=document.querySelector("h1");
//adds to classList
tag.classList.add("another-class");
tag.classList.remove("another-class");
tag.classList.toggle("another-class");
</pre>

**Manipulating Attributes**   
We use getAttribute() and setAttribute() to read and write attributes like src or href.  
<pre>
var link=document.querySelector("a);
link.getAttribute("href");
link.setAttribute("href","www.google.com");
</pre>
