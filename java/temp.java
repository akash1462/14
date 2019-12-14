import java.util.*;
class temp{
	public static void main(String[] args){
	float temp;

	Scanner in = new Scanner(System.in);

	System.out.println("Enter temp in fahrenheit");
	temp=in.nextInt();

	temp = ((temp-32)*5)/9;

	System.out.println("temp in celsius"+ temp);
}
}