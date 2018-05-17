package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml"); //Bean Loaded
        FootballCoach theCoach = context.getBean("myFootballCoach",FootballCoach.class); //Bean Retrieved
        System.out.println("Sport: " + theCoach.getSportName() + "\nWorkout: " + theCoach.getDailyWorkout()
        + "\nFortune: " + theCoach.getDailyFortune() + "\nTeam name: " + theCoach.getTeamName()
        + "\nEmail: " + theCoach.getEmail()); //Should stop being lazy and use StringBuilder.
        context.close(); //Closed the context.

    }

}
