import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of GenCs");
		int num = Integer.parseInt(scanner.nextLine());
		
		Student obj[] = new Student[num];
		
		for(int i = 0; i < num;i++){
			
			obj[i] = new Student();
			
			System.out.println("Enter Employee Id");
			long x = Long.parseLong(scanner.nextLine());
			
			System.out.println("Enter Name");
			String y = scanner.nextLine();
			
			obj[i].setEmployeeId(x);
			obj[i].setName(y);
			
		}
		
		for(int i=0; i <num; i++){
			obj[i].display();
		}
			
		
		
		
				
	}

}
