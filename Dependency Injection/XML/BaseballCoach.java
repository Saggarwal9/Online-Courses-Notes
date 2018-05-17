package ioc;

public class BaseballCoach implements Coach {
    private FortuneService service;
    
    BaseballCoach(FortuneService service){
        this.service=service;
    }
    
    BaseballCoach(){
        
    }
	
    @Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

    @Override
    public String getSportName() {
        // TODO Auto-generated method stub
        return "Baseball";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return service.getFortune();
    }
}
