package shanker.assignment.data;

public class RandomFortune implements FortuneService{
    @Override
    public String getFortune() {
        String arr[] = new String[]{"Good Luck","Extreme Good Luck","Taggede Le"};
        int index = (int) Math.floor(Math.random()*3);
        return arr[index];
    }
}
