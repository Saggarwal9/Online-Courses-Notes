package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

    //TODO: Load the config file
    //TODO: Retrieve the bean
    //TODO: Call the method on the bean
    //TODO: Close the application Context
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml"); //Bean Loaded
        Coach theCoach = context.getBean("myCoach",Coach.class); //Bean Retrieved
        System.out.println("Sport: " + theCoach.getSportName() + " : Workout: " + theCoach.getDailyWorkout()); //Should stop being lazy and use StringBuilder.
        context.close(); //Closed the context.

    }

}
