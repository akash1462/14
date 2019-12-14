import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number of players");
		Scanner scanner = new Scanner(System.in);
		int x = Integer.parseInt(scanner.nextLine());
		
		HashMap<String, Long> score = new HashMap<>(x);
		for(int i=1; i <= x; i++){
		System.out.println("Enter the details of the player " +i);
		String name = scanner.nextLine();
		Long runs = Long.parseLong(scanner.nextLine());
		score.put(name, runs);
		
		}
		
		Long maxvalue = (long)0;
		String mkey = null;
		for(String key:score.keySet()){
			if(score.get(key) > maxvalue){
				maxvalue = score.get(key);
				mkey = key;
			}
		}
		
		System.out.println(mkey);
	}

}
