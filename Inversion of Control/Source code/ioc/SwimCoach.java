package ioc;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private FortuneService service;
    @Value("${foo.email}")
    private String email;
    
    @Value("${foo.team}")
    private String team;
    
    public SwimCoach(FortuneService service) {
        this.service=service;
    }
    
    
    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Swim 1000 meters as a warm up.";
    }

    @Override
    public FortuneService getService() {
        // TODO Auto-generated method stub
        return service;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }
    
}
