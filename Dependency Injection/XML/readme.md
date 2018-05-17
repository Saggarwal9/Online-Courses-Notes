Outsource the injection and construction of the object to an external entity.  

There are many types of injections in spring, but the 2 most common ones are:-  
1) Construction Injection  
2) Setter Injection

#### Development Process
<pre>
1) Define the dependancy(helper) interface and class
2) Create a constructor in your class for injections
3) Configure the dependency injection in Spring config file. 
</pre>

For instance, the coach from Inversion of Control XML now provides fortune service.  
Now we have, an interface FortuneService that has a method String getFortune();  
And a class HappyFortuneService with the implementation of the method.  
In the baseball coach we add a private FortuneService field and a constructor  
setting the value of the variable.  

Now we add to our applicationContext.xml:- 
```xml
<bean id="myFortuneService"
  class="ioc.HappyFortuneService">
  
  <bean id="myCach"
    class="ioc.BaseballCoach">
      <constructor-arg ref="myFortuneService" > //ADDON
</bean>
```

