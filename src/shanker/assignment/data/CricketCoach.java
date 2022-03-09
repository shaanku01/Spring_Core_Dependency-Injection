package shanker.assignment.data;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String email;
    private String team;

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String doTraining() {
        return null;
    }

    @Override
    public String getDailyFortune() {
        return "Cricket Coach says "+fortuneService.getFortune();
    }
}
