
public class Product {
	private long id;
	private String productName;
	private String supplierName;
	
	public Product(long id,String productName, String supplierName){
		this.id= id;
		this.productName=productName;
		this.supplierName=supplierName; 
	}
	
	public long getId(){
		return id;
	}
	
	public void setId(long id){
		this.id = id;
	}
	
	public String getPname(){
		return productName;
	}
	
	public void setPname(String productName){
		this.productName = productName;
	}
	
	public String getSname(){
		return supplierName;
	}
	
	public void setSname(String supplierName){
		this.supplierName = supplierName;
	}

	public void display(){
		//Product Main = new Main();
		System.out.println("Product Id is " +getId());
		System.out.println("Product Name is " +getPname());
		System.out.println("Supplier Name is " +getSname());
	}
}