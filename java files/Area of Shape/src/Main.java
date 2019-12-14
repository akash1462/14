import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. Rectangle");
		System.out.println("2. Square");
		System.out.println("3. Circle");
		
		Shape obj;
		double area = 0.00;
		String shape = "";
		
		System.out.println("Area Calculator --- Choose your shape");
		int choice = scanner.nextInt();
		
		if(choice == 1 ){
			System.out.println("Enter length and breadth:");
			int length = scanner.nextInt();
			int breadth = scanner.nextInt();
			obj = new Rectangle(length,breadth);
			area = obj.calculateArea();
			shape = obj.getShapeName();
			
		}
		
		if(choice == 2){
			System.out.println("Enter side:");
			int side = scanner.nextInt();
			obj = new Square(side);
			area = obj.calculateArea();
			shape = obj.getShapeName();
			
		}
		
		if(choice == 3){
			System.out.println("Enter Radius:");
			int radius = scanner.nextInt();
			obj = new Circle(radius);
			area = obj.calculateArea();
			shape = obj.getShapeName();
			
		}
		
		System.out.printf("Area of %s is:%.2f", shape,area);
		
		
	}

}
