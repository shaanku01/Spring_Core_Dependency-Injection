package shanker.assignment.data;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CricketCoach myCoach = context.getBean("cricketCoach",CricketCoach.class);

        System.out.println(myCoach.getDailyFortune());
        System.out.println(myCoach.getEmail());
        System.out.println(myCoach.getTeam());

        context.close();

    }
}
