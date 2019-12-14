package javaexample;

public class vehicle {
	int wheels;
	
	public vehicle(int wheels){
		this.wheels = wheels;
		System.out.println(wheels + " wheeler vehicle created");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle v1 = new vehicle(2);
		vehicle v2 = new vehicle(3);
		vehicle v3 = new vehicle(4);
		
	}

}
