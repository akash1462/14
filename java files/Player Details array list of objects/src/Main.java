import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Player{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of players");
		int x = Integer.parseInt(scanner.nextLine());
	
		ArrayList<Player> playerList = new ArrayList<Player>(x);
	
		for(int i =0; i < x; i++){
			
		System.out.println("Enter the player name");
		String name = scanner.nextLine();
		
		System.out.println("Enter the country name");
		String country = scanner.nextLine();
		
		System.out.println("Enter the skill");
		String skill = scanner.nextLine();
		
		Player p = new Player(name, country, skill);
		playerList.add(p);
		
		}
		PlayerBO obj = new PlayerBO();
		obj.displayAllPlayerDetails(playerList);
	}
		

}
