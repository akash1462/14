package javaexample;
import java.util.Scanner;
public class Userarray {
	public static void main(String[] args){
		int row,col,i,j;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows (max 10:");
			row = scan.nextInt();
		System.out.print("Enter number of cols (max 10:");
			col = scan.nextInt();
			
			int arr[][]=new int[row][col];
			
			
		System.out.print("Enter" +(row*col)+ "Array elements :");
			for(i=0;i<row;i++){
				for(j=0;j<col;j++){
					arr[i][j]=scan.nextInt();
					
				}
			}
			
		System.out.println("The array is:\n");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
}
