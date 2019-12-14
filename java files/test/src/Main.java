import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {

	private static DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		double pur,price,sp;
		double cp,profit,profitper;
		System.out.println("Enter the number of dozens of toys purchased");
		
		Scanner scanner = new Scanner(System.in);
		pur = scanner.nextInt();
		
		System.out.println("Enter the price per dozen");
		price=scanner.nextInt();
		
		System.out.println("Enter the selling price of 1 toy");
		sp = scanner.nextInt();
		
		cp = price/12;
		profit = sp - cp;
		profitper = profit/cp*100;
		
		System.out.println("Sam's profit percentage is "+df.format(profitper)+" percent");
		
	}

}
