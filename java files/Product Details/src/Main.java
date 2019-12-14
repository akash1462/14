import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the product id");
		long x = Long.parseLong(scanner.nextLine());
		
		System.out.println("Enter the product name");
		String y = scanner.nextLine();
		
		System.out.println("Enter the supplier name");
		String z = scanner.nextLine();
		
		Product obj = new Product(x,y,z);
		
		obj.setId(x);
		obj.setPname(y);
		obj.setSname(z);
		//System.out.println("Product Id is " +obj.getId());
		obj.display();
	}
	
}
