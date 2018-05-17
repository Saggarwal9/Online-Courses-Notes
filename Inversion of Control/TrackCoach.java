package ioc;

public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getSportName() {
        // TODO Auto-generated method stub
        return "Track";
    }

}
