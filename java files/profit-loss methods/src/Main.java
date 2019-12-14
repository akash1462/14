import java.util.Scanner;

public class Main {

	private float calculateProfit(int dozenCount,int pricePerDozen, int sellPrice){
		
		
		float cp = pricePerDozen/12.0f;
		float profit = sellPrice - cp;
		float perc = profit/cp*100.0f;
		
		return perc;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main obj = new Main();
		
		System.out.println("Enter the number of dozens of toys purchased");
		Scanner scanner = new Scanner(System.in);
		int x= scanner.nextInt();
		
		System.out.println("Enter the price per dozen");
		int y=scanner.nextInt();
		
		System.out.println("Enter the selling price of 1 toy");
		int z=scanner.nextInt();
		obj.calculateProfit(x, y, z);
		
		System.out.printf("Sam's profit percentage is %.2f percent", obj.calculateProfit(x, y, z));
	}

}
