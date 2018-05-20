package ioc;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    //Field injection using Java Reflections
    @Autowired
    @Qualifier("sadService")
    private FortuneService service;
    
    //Constructor Injection
//    public TennisCoach() {
//        
//    }
//    
//    @Autowired
//    public TennisCoach(FortuneService service) {
//        this.service=service;
//    }
    
    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    public FortuneService getService() {
        return service;
    }

    //Setter Injection
//    @Autowired
//    public void DoSomeCrazyShit(FortuneService service) {
//        this.service = service;
//    }
//    
    
    
    @PostConstruct
    public void doStartupStuff() {
        System.out.println("Startup stuff");
    }
    
    @PreDestroy
    public void doCleanupStuff() {
        System.out.println("Clean the stuff");
    }

}
