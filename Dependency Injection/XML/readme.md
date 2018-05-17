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
      <!-- CONSTRUCTOR INJECTION -->
      <constructor-arg ref="myFortuneService" /> <!-- The /> IS SUPER IMPORTANT XML 101 GEEZ -->
</bean>
```

So we inject the fortune service dependency/helper using "Constructor Injection".  

2) Setter Injection
Now we have a class without the constructor with the fortune service arg.  
We replace the constructor-arg line with: 
```xml
<property name = "fortuneService" ref="myFortuneService" />
```
This calls the **setFortuneService** by capitalizing the first letter of the property name  
and prepending set to the name provided. 

To read literals

<property name= "fortuneService" value="You gon' die" />

To read from a property file

<pre>
1) Create Properties file.  
2) Load properties file in the Spring config file.  
3) Reference Values from the properties files.  
</pre>

1) Creating the properties file  
Open text file, and write:
<pre>
foo.email=abc@def.com
foo.team=whatevs
</pre>

2) Loading the properties file
<context:property-placeholder Location="classpath:sports.properties" />

3) Referencing the values
<property name="team" value="${foo.team}" />
