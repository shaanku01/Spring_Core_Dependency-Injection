package shanker.assignment.data;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        FortuneService obj = context.getBean("randomFortune",FortuneService.class);

        System.out.println(obj.getFortune());

        context.close();
    }
}
