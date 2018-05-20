Development Process:  
1) Create a Java class and annotate as @configuration.  
2) (Optional) Add component scanning support: @ComponentScan.  
3) Read Spring Java configuration class.  
4) Retrieve bean from spring container.  

Step 1:  
<pre>
@Configuration
public class SportConfig{

}
</pre>

Step 2:  
<pre>
@Configuration
@Component Scan("ioc")
public class SportConfig{

}
</pre>

Step 3:
<pre>
AnnotationConfigApplicationContext context = new AnnotationConfigApplication(SportConfig.class);
</pre>

Step 4:
<pre>
Coach the coach=context.getBean("tennisCoach", Coach.class);
</pre>

## Defining Beans with Java code

Instead of using 
```xml
<bean id=....>
</bean>
```
We can use java source code.  
1) Define methods to expose the bean  
2) Inject the bean dependencies  
3) Read spring config class  
4) Retrieve bean from the spring config

<pre>
Step 1:
@Bean
public Coach swimCoach(){ //swimCoach is the bean name, do not need any component scanning.  
  SwimCoach mySwimCoach = new SwimCoach();
  return mySwimCoach;
}
</pre>

Step 2:
<pre>
@Bean
public FortuneService getService{
  return new HappyFortuneService;
}

@Bean
public Coach swimCoach(FortuneService service){ //swimCoach is the bean name, do not need any component scanning.  
  SwimCoach mySwimCoach = new SwimCoach();
  return mySwimCoach;
}
</pre>

We avoid component scannning in this approach by manually defining our beans and their dependencies.  
Every other step is the same as above (Step 3 and 4 first section).  
