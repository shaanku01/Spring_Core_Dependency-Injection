package shanker.assignment.data;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String args[]){
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach obj = context.getBean("BaseBall",Coach.class);
        Coach obj1 = context.getBean("BaseBall",Coach.class);

        //Demonstrate LifeCycle methods:
        Coach obj2 = context.getBean("trackCoach",Coach.class);

        // Check if they are same:
        boolean result = (obj==obj1);
        System.out.println(result);
        System.out.println("Memory location of obj "+obj);
        System.out.println("Memory location of obj1 "+obj1);

        context.close();



    }
}
