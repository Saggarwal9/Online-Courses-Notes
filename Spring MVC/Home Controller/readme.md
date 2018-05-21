Development Process:
1) Create Controller Class  
2) Define Controller Method  
3) Add Request Mapping to controller method.  
4) Return view name.  
5) Develop a view page.  

Step 1:
<pre>
@Controller //Inherits component, so a part of component scanning.
public class HomeController{
}
</pre>

Step 2:
@Controller //Inherits component, so a part of component scanning.
public class HomeController{
  public String showMyPage(){ //Any methods, any params will work.
  }
}
</pre>

Step 3:
<pre>
@Controller //Inherits component, so a part of component scanning.
public class HomeController{
  @RequestMapping("\")
  public String showMyPage(){ //Any methods, any params will work.
  }
}
</pre>

Step 4:
<pre>
@Controller //Inherits component, so a part of component scanning.
public class HomeController{
  @RequestMapping("\")
  public String showMyPage(){ //Any methods, any params will work.
    return "main-menu";
  }
}
</pre>

Step 5:  
Use HTML to build a web-page. 
