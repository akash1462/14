import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int tents, sum = 0;
		int i=0;
		Scanner scanner = new Scanner(System.in);
		
		tents = scanner.nextInt();
		int[] refuge = new int[tents];
				
		while(i < tents){
			refuge[i] = scanner.nextInt();
			sum = sum + refuge[i];
			i++;
		}
		
		
		System.out.println(sum);
	}

}
