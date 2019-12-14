
public class HockeyPlayer extends Player implements IPlayerStatistics {

	private String position;
	private int noOfGoals;
	
	public HockeyPlayer(String name,String teamName,int noOfMatches, String position, int noOfGoals) {
		// TODO Auto-generated constructor stub
		super(name,teamName, noOfMatches);
		this.position = position;
		this.noOfGoals= noOfGoals;
	}
	
	public void displayPlayerStatistics(){
		//Player obj = new Player(name,teamName,noOfMatches, position, noOfGoals);
		System.out.println("Player Details");
		System.out.println("Player name : " +getName());
		System.out.println("Team name : "+ getTeamName());
		System.out.println("No of matches : "+ getNoOfMatches());
		System.out.println("Position : "+ position);
		System.out.println("No of goals taken : "+ noOfGoals);
		
	}

}
