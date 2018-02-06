import java.util.*;
public class part3{
	public static double sum() throws InputMismatchException{
		Scanner keyboard=new Scanner(System.in);
		double sum=0.0;
		double number=0.1;
		do{	System.out.println("The sum is "+sum+".");
			System.out.println("Enter a number to sum it up with other numbers(enter '0' to exit):");
			number=keyboard.nextDouble();
			sum+=number;
		}while(number!=0);
		return sum;
	}
	public static void main(String[]args){
		try{
			sum();
		}
		catch(InputMismatchException ex){
			System.out.println("A double value is required.");
		}
	
	}	
}
