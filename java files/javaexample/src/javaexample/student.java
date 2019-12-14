package javaexample;

public class student {
	static int stid=100;
	static String stname= "cognizant";
	public static void display(){
		System.out.println("total no. of students :" +stid);
		System.out.println("name of organization :" +stname);
		
	}
	
	public static void main(String[] args){
		display();
		
		//student obj = new student();
		System.out.println(student.stid);
	}
	
	
}

