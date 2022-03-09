package shanker.assignment.data;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String args[]){
        //load the spring config file;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //retrieve bean from the spring container:
        Coach theCoach = context.getBean("myCoach",Coach.class);
        Coach BaseBall = context.getBean("BaseBall",Coach.class);
        Coach trackCoach = context.getBean("trackCoach",Coach.class);
        Coach cricketCoach = context.getBean("cricketCoach",Coach.class);

        //call methods on the bean
        System.out.println(theCoach.doTraining());
        System.out.println(BaseBall.doTraining());
        System.out.println(BaseBall.getDailyFortune());
        System.out.println(trackCoach.getDailyFortune());

        System.out.println(cricketCoach.getDailyFortune());
        //close the context:
        context.close();
    }
}
