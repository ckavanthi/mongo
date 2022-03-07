package datastructure;
import java.util.Scanner;
public class q4 
{
	public int declareResult(int subject1Marks,int subject2Marks,int subject3Marks)
	{
		Scanner sc=new Scanner(System.in);
		subject1Marks=sc.nextInt();
		subject2Marks=sc.nextInt();
		subject3Marks=sc.nextInt();
		if((subject1Marks+subject2Marks+subject3Marks)>60)
		{
			System.out.println("Passed");
		}
		if(((subject1Marks+subject2Marks)|(subject2Marks+subject3Marks)|(subject3Marks+subject1Marks))>60)
		{
			System.out.println("Promoted");
		}
		else {
			System.out.println("Failed");
		}
		return 0;
	}

	public static void main(String[] args)
	{
	 q4 obj=new q4();
	 obj.declareResult(0,0,0);
	 

	}

}
