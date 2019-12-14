import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Select the Card");
		System.out.println("1.Payback Card");
		System.out.println("2.Membership Card");
		
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		String details = "";
		double totalAmount = 0.00;
		scanner.nextLine();
		
		System.out.println("Enter the Card Details:");
		
		details = scanner.nextLine();
		
		String[] arrsplit = details.split("\\|", 3);
		
		if(choice == 1){	
		System.out.println("Enter points in card");
		int pointsEarned = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Enter Amount");
		totalAmount = Double.parseDouble(scanner.nextLine());
		
		PaybackCard obj = new PaybackCard(arrsplit[0], arrsplit[1], arrsplit[2], pointsEarned, totalAmount);
		System.out.println(obj.getHolderName() + "'s Payback Card Details:");
		System.out.println("Card Number "+ arrsplit[1]);
		System.out.println("Points Earned "+obj.getPointsEarned());
		System.out.println("Total Amount "+ obj.getTotalAmount());
		}
		
		if(choice == 2){
			System.out.println("Enter rating in card");
			int rating = scanner.nextInt();
			
			MembershipCard obj = new MembershipCard(arrsplit[0], arrsplit[1], arrsplit[2], rating);
			System.out.println(obj.getHolderName() + "'s Membership Card Details:");
			System.out.println("Card Number "+ arrsplit[1]);
			System.out.println("Rating "+obj.getRating());
		}
		
	}

}
