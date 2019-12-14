import java.util.Scanner;

public class Main extends Product {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the product id");
		long id = Long.parseLong(scanner.nextLine());
		
		System.out.println("Enter the product name");
		String productName = scanner.nextLine();

		System.out.println("Enter the supplier name");
		String supplierName = scanner.nextLine();
		
		Product obj = new Product(id,productName,supplierName);
		//System.out.println(obj);
		
		obj.setId(id);
		obj.setProductName(productName);
		obj.setSupplierName(supplierName);
		
		obj.toString();
//		System.out.println(s);
		
		System.out.println("Invoking getClass() method : " + obj.getClass());
	}

}
