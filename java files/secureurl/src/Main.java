import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
			str1 = scanner.nextLine(); 
		System.out.println("Enter the start string");
			str2 = scanner.nextLine();
			
		if (str1.startsWith(str2)){
			System.out.println('"' + str1 + '"' +" starts with "+ '"' + str2 + '"');
			
		}
		else
			System.out.println('"' + str1 + '"' +" does not start with "+ '"' + str2 + '"');
			
		
	}

}
