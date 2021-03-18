import java.util.Scanner;

public class MarsWeight 
{
	static WeightList list = new WeightList();
	static Scanner input = new Scanner(System.in);
	
	public static double Calculate(double earth)
	{
		double mars = earth*(37.83/100);
		return mars;
	}
		
	public static void Receive()
	{
		double EarthWeight;
		double MarsWeight;
		
	    System.out.println("Enter Your Weight(KG): "); 
	    
	    EarthWeight = input.nextDouble(); 
	    MarsWeight = Calculate(EarthWeight);
	    
	    System.out.println("Your Weight(KG) On Mars is: " + MarsWeight +"\n"); 
	   
	    //list.list.add(EarthWeight);
	    //list.list.add(MarsWeight);
	    //list.printList();
	    
	    list.FillList(EarthWeight, MarsWeight);
	    
	    input.close();
	}
	
	public static void main(String args[])
	{
		Receive();
	}
}
