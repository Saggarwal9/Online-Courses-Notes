package ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigApp {
    public static void main(String arg[]) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
        SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getService().getFortune());
        System.out.println("email: " + theCoach.getEmail());
        context.close();
    }
}
