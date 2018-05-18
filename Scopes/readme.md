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
