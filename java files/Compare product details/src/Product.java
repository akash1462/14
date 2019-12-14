
public class Product {
	private long id;
	private String productName;
	private String supplierName;
	
	public Product(){
		
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Product(long id,String productName, String supplierName){
		this.id= id;
		this.productName=productName;
		this.supplierName=supplierName; 
	}
	
	public void display(){
		//Product Main = new Main();
		System.out.println("Product Id is " +getId());
		System.out.println("Product Name is " +getProductName());
		System.out.println("Supplier Name is " +getSupplierName());
	}
	
}
