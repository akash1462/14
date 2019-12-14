import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int x;
		int sum = 0;
		float y;
		x = scanner.nextInt();
		int[] numbers = new int[x];
		
		for(int i=0;i < x;i++){
			numbers[i] = scanner.nextInt();
			
		}
		
		for (int a : numbers){
			
			sum = sum +a;	
		}
		System.out.println(sum);
		y = (float)sum /x;
		System.out.printf("%.2f",y);
	}

}
