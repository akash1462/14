import java.util.Scanner;

public class Main extends Product{

	public boolean equals(Product obj[]){
		if(obj[0].getId() == obj[1].getId() && obj[0].getProductName().equals(obj[1].getProductName()) && obj[0].getSupplierName().equals(obj[1].getSupplierName())){
			System.out.println("The two products are the same");
			return true;
		}
			
		else{
			System.out.println("The two products are different");
			return false;
		}
			
				
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scanner = new Scanner(System.in);
		Product obj[] = new Product[2];
			
		for(int i=0; i <2;i++){
				
			obj[i] = new Product();
			
		System.out.println("Enter the product id");
		long id = Long.parseLong(scanner.nextLine());
		
		System.out.println("Enter the product name");
		String productName = scanner.nextLine();

		System.out.println("Enter the supplier name");
		String supplierName = scanner.nextLine();
		
		
		
		
		obj[i].setId(id);
		obj[i].setProductName(productName);
		obj[i].setSupplierName(supplierName);
		obj[i].display();
	}	
		Main obj1 = new Main();
		obj1.equals(obj);
	}
}
