import java.util.*;
import java.lang.Math;
public class bin2dec{
	public static String bin2Dec(String binaryString) throws NumberFormatException{
		double Dec=0.0;
		for(int n=0;n<=binaryString.length()-1;n++){
			if(binaryString.charAt(n)=='1'){
				Dec=Dec+Math.pow(2,((binaryString.length())-n-1));
			}
			if(binaryString.charAt(n)!='0'|binaryString.charAt(n)!='1'){		
					throw new NumberFormatException();			
			}		
		}
	String result= Double.toString(Dec);
	return result;
	}
	public static void main(String[]args){
		Scanner keyboard=new Scanner(System.in);
		try{	System.out.println("Enter a binary string to convert it to decimal string:");
			System.out.println(bin2Dec(keyboard.nextLine()));
		
		}
		catch(NumberFormatException ex){
			System.out.println("You must enter a binary string.");
		}
	}

}
