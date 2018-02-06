import java.util.*;
public class part2{
	public static void main(String[]args){
		Scanner keyboard=new Scanner(System.in);
		double sum=0.0;
		double number=0.1;
		do{	
			try{	System.out.println("The sum is "+sum+".");
				System.out.println("Enter a number to sum it up with other numbers(enter 0 to exit):");	
				number=keyboard.nextDouble();
				sum+=number;
			}
			catch(InputMismatchException ex){
				System.out.println("Try again. A double value is required.");
				keyboard.nextLine();
			}
		}while(number!=0.0);

	}
}
