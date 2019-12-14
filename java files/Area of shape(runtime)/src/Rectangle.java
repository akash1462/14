
public class Rectangle extends Shape {
	private int length;
	private int breadth;
	
	public Rectangle(int length,int breadth){
		super("Rectangle");
		this.length= length;
		this.breadth = breadth;
		
	}
	public double calculateArea(){
		double area = 0.00;
		area = length*breadth;
		return (area);
	}
	

}
