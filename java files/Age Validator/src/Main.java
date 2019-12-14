import java.util.Scanner;

class myexception extends Exception{
	public myexception(String s){
		super(s);
	}
	      
	  }  

public class Main {

	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the player name");
		String name = scanner.nextLine();
		
		System.out.println("Enter the player age");
		int x = scanner.nextInt();
		
		
		try{
			
			if(x<19)  
			      throw new myexception("InvalidAgeRangeException");  
			System.out.println("Player name : "+ name);
			System.out.println("Player age : "+ x);
		}
		catch(Exception a){
			System.out.println("CustomException: " + a.getMessage());

	    	
		}
	}
}