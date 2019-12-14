import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String con,old,new1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the content of the document");
			con = scanner.nextLine();
		
		System.out.println("Enter the old name of the company");
			old = scanner.nextLine();
		
		System.out.println("Enter the new name of the company");
			new1 = scanner.nextLine();
			
		System.out.println("The content of the modified document is");
		System.out.print(con.replace(old, new1));
		
		
		
	}

}
