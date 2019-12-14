import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int day;
		
		String[] arr = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the day number");
		day = scanner.nextInt();
		
		System.out.println("Day of the week is " +arr[day -1]);
		
		
	}
	
}
