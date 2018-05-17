package ioc;

public class BaseballCoach implements Coach {
	
    @Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

    @Override
    public String getSportName() {
        // TODO Auto-generated method stub
        return "Baseball";
    }
}
