import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int num1,num2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		num1 = scanner.nextInt();
		
		System.out.println("Enter the second number");
		num2 = scanner.nextInt();
		
		if (num1 < num2)
			System.out.println(num1 + " is less than " + num2);
		else if(num1 > num2)
			System.out.println(num1 + " is greater than " + num2);
		else if(num1 == num2)
			System.out.println(num1 + " is equal to " + num2);
	}
	
	
}
