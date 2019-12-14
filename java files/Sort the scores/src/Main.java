
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
				
		ArrayList<Integer> score = new ArrayList<Integer>(n);
		
		for(int i=0; i < n; i++)
			score.add(scanner.nextInt());
		
		Collections.sort(score);
		for(int a =0; a < score.size(); a++)
			System.out.println(score.get(a));
	}

}