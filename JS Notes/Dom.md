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
