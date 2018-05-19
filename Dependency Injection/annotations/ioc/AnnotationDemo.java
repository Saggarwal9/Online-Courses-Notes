package ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {
    public static void main(String arg[]) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach=context.getBean("tennisCoach",Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getService().getFortune());
        context.close();
    }
}
