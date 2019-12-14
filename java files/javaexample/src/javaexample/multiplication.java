package javaexample;

public class multiplication {
			int x,y,z;
		
		public multiplication(){
			x=10;
			y=100;
		}
		
		public multiplication(int a,int b){
			
			this.x = a;
			this.y = b;
		}
		
		public void mul(){
			z = x*y;
		}
		
		public void display(){
			System.out.println("multiplication is " +z);
			
		}
		
		public static void main(String[] args){
			multiplication obj = new multiplication();
			obj.mul();
			obj.display();
			
			multiplication obj1 = new multiplication(100,200);
			obj1.mul();
			obj1.display();
			
			
		}
		
		
}
