package shanker.assignment.data;

public class BaseballCoach implements Coach {
    //defining a private field for the dependency
    private FortuneService obj;
    //Defining a constructor for dependency Injection..
    public BaseballCoach(FortuneService fortuneService){
        obj = fortuneService;
    }


    @Override
    public String doTraining() {
       return "Base Ball Training";
    }

    @Override
    public String getDailyFortune() {
       //USe the fortune service to give fortune:
        return obj.getFortune();
    }
}
