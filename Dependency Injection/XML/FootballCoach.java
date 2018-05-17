package ioc;

public class FootballCoach implements Coach {

    private FortuneService service;
    private String team;
    private String email;
    
    FootballCoach(){
        
    }
    
    FootballCoach(FortuneService service){
        this.service=service;
    }
    
    public void setFortuneService(FortuneService service) {
        this.service=service;
    }
    
    public void setTeamName(String name) {
        team=name;
    }
    
    public String getTeamName() {
        return team;
    }
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method stub
        return "Do legs workout everyday";
    }

    @Override
    public String getSportName() {
        // TODO Auto-generated method stub
        return "Football";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return service.getFortune();
    }

}
