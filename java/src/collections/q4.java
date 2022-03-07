package collections;
import java.util.*;
public class q4 
{

	public static void main(String[] args)
	{
		List<String> date = new LinkedList<>();
		String d=date.next();
		for (String it : date) 
		{
		String[] strings = it.split("-");
		if((int)Integer.parseInt(strings[2])%4==0 && (int)Integer.parseInt(strings[2])%100==0 && (int)Integer.parseInt(strings[2])%400==0)
		{
			System.out.println(it+" Leap Year");
		}
		else 
		{
			System.out.println(it+" Not a Leap Year");
		}
    }

	}

}
