###jJQuery
A JS Library that makes DOM easier.  

#### Reasons to use JQuery
1) Fixes "broken" DOM API.  //The reason why it was created in the first place.
2) Brevity and Clarity.  
3) Ease of use.  //Makes code shorter
4) Cross-Browser Support.  //Works on all browser
5) AJAX.  //Subset of features.

#### Reasons to not use JQuery
1) The DOM API is no longer "broken".  
2) It doesn't do anything you can't do on your own.  
3) It's an unnecessary dependency.  
4) Performance

### How to include JQuery
```html
<!-- Download jQuery and link to it locally: -->
<script type="text/javascript" src="jquery.js"></script>
<!-- OR Link to a CDN(a hosted copy) -->
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.4.js"></script>
```

### jQuery Selector
1) Selecting with jQuery
<pre>
$("img") //select all img tags
$(".sale")//select all elements with class sale
$("#bonus")//to select elements with id bonus
$("li a")//to select all a tangs inside li
$("li:first-of-type") //selects first li in the script
</pre>

2) Manipulating style
<pre>
$("#special").css("color","yellow");
var styles = {
  backgroundColor: "pink",
  fontWeight: "bold"
};
$("#special").css(styles);
//make all LI's yellow
$("li).css("color","yellow");
$("li").css({
  fontSize: "10px",
  border: "3px dashed purple",
  background: "rgba(89, 45, 20, 0.5)"
});
</pre>

### Methods
<pre>
selector.text(); //Returns all the text under the tag. We can also set the text by providing the string as the argument.
selector.html(); //Gets the HTML content of the first element in the set of matched elements or sets the content of every matched element.
selector.attr(); //gets the value of the attribute of the first element in the set of matched element or set one or more attributes for every matched element.
selector.last().attr("src","www....."); //Changes for the last attribute
selector.first()//first element under the selector.
selector.val(); //Gets the current value of the first element in the set of matched elements or set the type of every matched element.
//for example text in a text type input. Or make the text input empty by .val("");

//Work with CSS classes with each element in the set of matched elements.
selector.addClass()
selector.removeClass()
selector.toggleClass()
</pre>
