For dependency injection, Spring can use auto wiring.  
Spring will look for a class that matches the property,  
matches by type: class or interface  
Spring will inject it automatically.  

Autowiring has 3 types of injection  
1) Constructor Injection  
2) Setter Injection  
3) Field Injection  

1) Constructor Injection  
Add the @component annotation to the interface and the @Autowire to the  
constructor and see the **magic**.  

2) Setter Injection  
Add the @Autowire to the setter methods or any methods, just give the @Autowire injection.  
<pre>
public void doSomeCrazyShiz(FortuneService service){ //THIS WORKS TOO.
  this.service=service;
}
</pre>

3) Field Injection  
Accomplished by Java Reflections.  
use Autowired annotation directly on the field.  No need for any method.  
(This is just downright amazing.)

## Which type of injection should we use?  
Choose a style and stay consistent within your project, will make it easy for you  
and your team members. All the injections are equally good. Choose one.

## What happens when there are multiples annotations?  
For instance, HappyFortuneService, RestfulFortuneService, DBFortuneService, SadFortuneService.  
This will give you a NoUniqueBeanDefinitionException.  
We use @Qualifier("<Bean id>") for instance, @Qualifier("happyFortuneService") under the  
@AutoWired annotation. 
