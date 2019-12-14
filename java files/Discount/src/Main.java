import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
	private static DecimalFormat df = new DecimalFormat("0.00");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double item1,item2,disc,total,disamt,save;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Price of item 1 :");
		item1 = scanner.nextDouble();
		
		System.out.println("Price of item 2 :");
		item2 = scanner.nextDouble();
		
		System.out.println("Discount in percentage :");
		disc = scanner.nextDouble();
		
		total = item1 +item2;
		System.out.println("Total amount : $" +df.format(total));
		
		disamt = total *(1-disc/100);
		System.out.println("Discounted amount : $" +df.format(disamt));
		
		save = total - disamt;
		System.out.println("Saved amount : $" +df.format(save));
	}

}
