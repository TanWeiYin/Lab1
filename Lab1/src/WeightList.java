import java.util.ArrayList;
import java.util.List;

public class WeightList 
{
	List<Double> list = new ArrayList<Double>();  
  
	public void FillList(double ew, double mw)
	{		
		list.add(ew);
		list.add(mw);	   
		printList();
	}
	
	
	public void printList()
	{		
		System.out.println("Earth (KG) \tMars(KG)");
		
		for(int i = 0; i < list.size(); i+=2)
		{
			System.out.println(String.format("%.2f", list.get(i))+"\t \t"+ String.format("%.2f", list.get(i+1)));
		}
		System.out.println("\n");
		MarsWeight.Receive();
	}
}
