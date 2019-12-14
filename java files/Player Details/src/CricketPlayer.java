
public class CricketPlayer extends Player implements IPlayerStatistics {

	private int totalRunsScored;
	private int noOfWicketsTaken;
	
	
	public CricketPlayer(String name, String teamName,int noOfMatches,int totalRunsScored, int noOfWicketsTaken) {
		// TODO Auto-generated constructor stub
		super(name,teamName, noOfMatches);
		this.totalRunsScored= totalRunsScored;
		this.noOfWicketsTaken= noOfWicketsTaken;
		
	}
	
	public void displayPlayerStatistics(){
		//Player obj = new Player(name,teamName,noOfMatches, totalRunsScored, noOfWicketsTaken);
		System.out.println("Player Details");
		System.out.println("Player name : " +getName());
		System.out.println("Team name : "+ getTeamName());
		System.out.println("No of matches : "+ getNoOfMatches());
		System.out.println("Total runsscored : "+ totalRunsScored);
		System.out.println("No of wickets taken : "+ noOfWicketsTaken);
		
	}

}
