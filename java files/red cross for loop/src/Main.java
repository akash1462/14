import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int tents, sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		tents = scanner.nextInt();
		int[] refuge = new int[tents];
		
		for(int i=0;i < tents;i++){
			refuge[i] = scanner.nextInt();
			sum = sum + refuge[i];
		}
		
		System.out.println(sum);
		
	}

}
