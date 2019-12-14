import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int tents, sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		tents = scanner.nextInt();
		int[] refuge = new int[tents];
		
		for(int i=0;i < tents;i++){
			refuge[i] = scanner.nextInt();
			
		}
		
		for(int a : refuge){
			//System.out.println(i);
			sum = sum + a;
		}
		
		System.out.println(sum);
		
	}

}
