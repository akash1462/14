import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Menu");
		System.out.println("1.Crciket Player Details");
		System.out.println("2.Hockey Player Details");
		System.out.println("Enter choice");
		
		Scanner scanner = new Scanner(System.in);
		int choice = Integer.parseInt(scanner.nextLine());
				
		
		
		
		if(choice == 1){
			
			System.out.println("Enter player name");
			String name = scanner.nextLine();
			
			System.out.println("Enter team name");
			String teamName = scanner.nextLine();
			
			System.out.println("Enter number of matches played");
			int noOfMatches=Integer.parseInt(scanner.nextLine());
			
			System.out.println("Enter total runs scored");
			int totalRunsScored = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Enter total number of wickets taken");
			int noOfWicketsTaken =  Integer.parseInt(scanner.nextLine());
			
			CricketPlayer obj = new CricketPlayer(name,teamName,noOfMatches, totalRunsScored, noOfWicketsTaken);
			obj.displayPlayerStatistics();
			
		}
		
		if(choice == 2){
			System.out.println("Enter player name");
			String name = scanner.nextLine();
			
			System.out.println("Enter team name");
			String teamName = scanner.nextLine();
			
			System.out.println("Enter number of matches played");
			int noOfMatches=Integer.parseInt(scanner.nextLine());
			
			System.out.println("Enter the position");
			String position = scanner.nextLine();
			
			System.out.println("Enter total number of goals taken");
			int noOfGoals = Integer.parseInt(scanner.nextLine());
			
			HockeyPlayer obj = new HockeyPlayer(name,teamName,noOfMatches, position, noOfGoals);
			obj.displayPlayerStatistics();
		}
		
		if(choice == 3){
			System.out.println("Invalid Input");
		}
		
		
		
	}
	

}
