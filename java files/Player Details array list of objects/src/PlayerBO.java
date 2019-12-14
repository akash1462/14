import java.util.ArrayList;

public class PlayerBO {

	void displayAllPlayerDetails(ArrayList playerList){
		System.out.println("Player Details");
		for ( Object a : playerList){
			System.out.println(a);
		}
	}
}
