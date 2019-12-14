import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Account Number");
		String x = scanner.nextLine();
		
		System.out.println("Enter the Account Balance");
		int y = Integer.parseInt(scanner.nextLine());
		
		System.out.println("Enter 1 to deposit an amount,2 to withdraw an amount");
		int z = Integer.parseInt(scanner.nextLine());
		
		Account obj = new Account("0",y);
		
		int deposit,withdraw;
		
		if(z == 1){
			
			System.out.println("Enter the amount to deposit");
			deposit = scanner.nextInt();
			obj.deposit(deposit);
		}
		
		if(z==2){
			System.out.println("Enter the amount to withdraw");
			withdraw = scanner.nextInt();
			obj.withdraw(withdraw);
			
			
		}
		
		obj.setAccountNumber(x);
	}

}
