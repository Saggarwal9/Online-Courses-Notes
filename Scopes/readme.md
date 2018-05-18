## Bean Scopes

```xml
<beans ...>
  <bean id=....
    class=....
    scope="singleton">
    </bean>
</beans>
```

Singleton scope = Creates a single shared instance of the bean. **Default Scope**.  
<pre>
  Coach c1,c2;
  c1=new Coach();
  c2=c1;
</pre>
Prototype scope = Creates a new bean instance for each container request. 
<pre>
  Coach c1,c2;
  c1=new Coach();
  c2=new Coach();
</pre>
Request scope= Scoped to an HTTP web request. **Only used for Web Applications.**  
Session scope= Scoped to an HTTP web session. **Only used for Web Applications.**  
Global Session scope= Scoped to a global HTTP web session. **Only used for a Web Application.**  

## Bean Lifecycles

Bean Initialization and Destruction:

```xml
<beans ...>
  <bean id=....
    class=....
    scope="singleton"
    init-method="doMyStartUpStuff" <--! Method name -->
    destroy-method="doMyCleanupStuff">
    </bean>
</beans>
```

For "prototype" scoped beans, Spring **does not call the destroy method.**  
In contrast to the other scopes, Spring does not manage the complete lifecycle of a prototype bean:  
the container instantiates, configures, and otherwise assembles a prototype object, and hands it to the  
client, with no further record of that prototype instance.  

Thus, although initialization lifecycle callback methods are called on all objects regardless of scope,  
in the case of prototypes, configured destruction lifecycle callbacks are not called. The client code  
must clean up prototype-scoped objects and release expensive resources that the prototype bean(s) are holding.  
