import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		int day;
		
		String[] arr;
		arr = new String[7];
		
		arr[0]= new String("Sun");
		arr[1] = new String("Mon");
		arr[2] = new String("Tue");
		arr[3] = new String("Wed");
		arr[4] = new String("Thu");
		arr[5] = new String("Fri");
		arr[6] = new String("Sat");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the day number");
		day = scanner.nextInt();
		
		System.out.println("Day of the week is " +arr[day -1]);
		
		
	}
	
}
