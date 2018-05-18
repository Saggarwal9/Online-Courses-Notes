Step 1:  
Enable component scanning in Spring Config file.  

```xml
<beans ....>
  <context:component-scan base-package="ioc" /> <!--ioc=package name-->
</beans>
```
Step 2: Add Annotation  
<pre>
@Component("FootballCoach")  //Bean name
public class FootballCoach implements Coach{....}  
</pre>

Step 3: Retrieving Beans from the annotation  
<pre>
Coach theCoach = context.getBean("FootballCoach",Coach.class);
</pre>

We don't necessarily have to define a bean id through annotation,   
if the class name is TennisCoach, then the default annoation will be
**tennisCoach**. (first letter lowercase)
