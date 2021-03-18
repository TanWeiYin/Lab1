import java.util.Scanner;

public class MarsWeight 
{
	
	
	public static void main(String args[])
	{
		double EarthWeight;
		
		Scanner input = new Scanner(System.in);
		
	    System.out.println("Enter Your Weight(KG): ");  
	    EarthWeight = input.nextDouble();  
	    
	    System.out.println("Your Weight(KG) On Mars is: " + EarthWeight*(37.83/100)); 
	    
	    input.close();
	}
}
