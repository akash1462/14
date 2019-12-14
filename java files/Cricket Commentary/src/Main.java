import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Menu");
		System.out.println("1. Player details of the delivery");
		System.out.println("2. Run details of the delivery");
		
		Scanner scanner = new Scanner(System.in);
		
		int choice = Integer.parseInt(scanner.nextLine());
		
		Delivery obj = new Delivery();
		if(choice == 1){
			System.out.println("Enter the bowler name");
			String bowler = scanner.nextLine();
			//obj.bowler(bowler);
			
			System.out.println("Enter the batsman name");
			String batsman = scanner.nextLine();
		
			obj.displayDeliveryDetails(bowler, batsman);
		}
		
		if(choice == 2){
			System.out.println("Enter the number of runs");
			Long runs = Long.parseLong(scanner.nextLine());
			obj.display(runs);
		}
		
		
	}

}
