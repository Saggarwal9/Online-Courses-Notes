## Creating Beans Through XML

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
