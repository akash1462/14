
public class Circle extends Shape{
	private int radius;
	
	public Circle(int radius){
		super("Circle");
		this.radius = radius;
	}
	
	double calculateArea(){
		double area = 0.00;
		area =  Math.PI * radius * radius;
		return(area);
	}
	
	
}
