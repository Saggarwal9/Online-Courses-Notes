package ioc;

public class TrackCoach implements Coach{

    private FortuneService service;

    TrackCoach(FortuneService service){
        this.service=service;
    }
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getSportName() {
        // TODO Auto-generated method stub
        return "Track";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return service.getFortune();
    }

}
