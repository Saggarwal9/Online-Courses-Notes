To specify the scope, we can use @Scope(<Scope name>) for instance  
@Scope("Singleton") under the @Component annotation.  

For Lifecycle: @PostConstruct and @PreDestroy
<Pre>
@PostConstruct
public void doMyStartupStuff(){
}

@PreDestroy
public void DoMyCleanupStuff(){
}
