Inversion of Control(IOC) is the approach of outsourcing the construction and  
management of objects. Outsourcing will be handled by the object factory.  

For instance take a generic example of code:

<pre>
Interface Coach with a method getDailyWorkout()
Class TrackCoach implements coach and the method
Class BasketballCoach implements coach and the method  
Class main prints the method  
</pre>

The problem with this is that when we have to print a specific class's get dailyworkout,  
we have to change the interface. It would be good if we can have a config file that just   
reads what data we want and does the job and thats where **inversion of control** comes in. 

We make use of an objectfactory to come with this solution. 

<pre>
Spring Container Primary Functions:
Create and manage objects (Inversion of control).
Inject object's dependencies (Dependency Injection).
</pre>

Three ways of configuring the spring container:  
a) XML Configuration (Used by Legacy Apps)  
b) Java Annotations (modern)  
c) Java source code (modern)  

Spring Development Process:  
a) Configure your spring breans  
b) Create a spring container  
c) Retrieve beans from spring container  

#### What are Java Beans?
In Spring, the objects that form the backbone of your application and that are managed by the Spring IoC  
container are called beans. A bean is an object that is instantiated, assembled, and otherwise managed  
by a Spring IoC container. Otherwise, a bean is simply one of many objects in your application. Beans,   
and the dependencies among them, are reflected in the configuration metadata used by a container.  

**Essentially** Beans are just java objects.

#### Configuring Spring Container

```xml
//name of the file: "applicationContext.xml"  
<beans ...>  
  <bean id="mycoach" //The ID the java application will use when it wants to retreive the bean.  
        class="ioc.BaseballCoach"> //Actual implementation for the application.  
  </bean>  
</beans>  
```

#### Creating Spring Container
Spring container is generally known as the ApplicationContext
<pre>
//Reading the XML in the class-path. 
ClassPathXmlApplicationContext context= new ClassPathXmlAplliactionContext("applicationContext.xml"); 
</pre>

Based on the configuration in the xml file, it will give us the type of object we want.  

<pre>
Coach theCoach = context.getBean("myCoach",Coach.class); //myCoach is the id ,Coach.class is the interface
</pre>

#### Extra
Headers to start the configuration file.
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">
</beans>


```
