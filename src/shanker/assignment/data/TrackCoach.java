package shanker.assignment.data;

public class TrackCoach implements Coach {

    private FortuneService obj;

    public TrackCoach(){

    }
    public TrackCoach(FortuneService fortuneService){
        obj = fortuneService;
    }

    @Override
    public String doTraining() {
        return "Do 5k running daily...";
    }

    @Override
    public String getDailyFortune() {
        return "You can do it ::" + obj.getFortune();
    }


    //Init Method:

    public void doMyStartUpStuff(){
        System.out.println("Track-Coach: Do my StartUp stuff");
    }


    //Destroy Method:
    public void doMyCleanUpStuff(){
        System.out.println("Track-Coach: Do my CleanUp stuff");
    }


}
