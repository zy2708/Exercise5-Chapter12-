import java.util.Scanner;
public class part1{
	public static void main(String[]args){
		System.out.println("Enter a number to sum it up with other numbers(enter 'quit' to exit):");
		Scanner keyboard=new Scanner(System.in);
		String n=keyboard.next();
		double sum=0.0;
		while(!n.equals("quit")){
			double number=Double.parseDouble(n);
			sum+=number;
			System.out.println(sum);
			System.out.println("Enter a number to sum it to other numbers:");
			n=keyboard.next();
		
		}

	}
}
