package datastructure;
import java.util.Scanner;
public class q5
{
   public double calculateTaxAmount(int ctc)
   {
	   if(ctc<180000)
	   {
		   System.out.println("Nil");
	   }
	   else if(ctc>=18001&&ctc<300000)
	   {
		   int tax=ctc*10/100;
		   System.out.println(tax);
	   }
	   else if(ctc>=300001&&ctc<500000)
	   {
		   int tax=ctc*20/100;
		   System.out.println(tax);
	   }
	   else if(ctc>=500001&&ctc<1000000)
	   {
		   int tax=ctc*30/100;
		   System.out.println(tax);
	   }
	   return ctc;
		   
   }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Income");
		int ctc=sc.nextInt();
		q5 obj=new q5();
		obj.calculateTaxAmount(ctc);
	}

}
