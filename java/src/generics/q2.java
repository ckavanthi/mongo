package generics;
import java.util.HashMap;
import java.util.Map.Entry;
public class q2 
{

	public static void main(String[] args) 
	{
		HashMap<Integer,Double> a = new HashMap<>();
		a.put(1, 2.3);
		a.put(2, 1.4);
		a.put(3, 3.8);
		a.put(4, 8.3);
		a.put(5, 7.7);
		a.put(6, 6.8);
		a.put(7, 5.2);
		a.put(8, 6.9);
		a.put(9, 4.2);
		a.put(10, 9.1);
		for (Entry<Integer, Double> c :a.entrySet()) 
		{
			System.out.println(c);

	    }
    }
}
