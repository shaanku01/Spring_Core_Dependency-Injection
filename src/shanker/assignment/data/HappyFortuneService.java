package shanker.assignment.data;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is your good luck day..";
    }
}
