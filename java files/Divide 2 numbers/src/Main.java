import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the 2 numbers");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		//int c = a/b;
		try{
			System.out.println("The quotient of "+ a + "/" + b+ " = " +a/b);	
		}
		
		catch(ArithmeticException e){
			System.out.println("DivideByZeroException caught");
		}
		
		finally{
			System.out.println("Inside finally block");
		}
		
		
		

	}

}
