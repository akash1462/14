import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter x");
		x = scanner.nextInt();
		
		System.out.println("Enter y");
		y = scanner.nextInt();
		
		System.out.println("Enter z");
		z = scanner.nextInt();
		
		
		if(x < y && x < z)
			System.out.println("L1 has the minimal seating capacity");
		else if(y < x && y < z )
			System.out.println("L2 has the minimal seating capacity");
		else if(z < x && z < y )
			System.out.println("L3 has the minimal seating capacity");
		
	}

}
