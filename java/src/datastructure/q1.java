package datastructure;
import java.util.Scanner;

class q1 {
	public boolean armstrongCheck(int num)
	{ 
		int n1,n2,n3,c;
		c=num;
		n1=c%10;
		c=c/10;
		n2=c%10;
		c=c/10;
		n3=c%10;
		int result=(n1*n1*n1)+(n2*n2*n2)+(n3*n3*n3);
		System.out.println(result);
		if(num==result)
		{
			System.out.println("The number is Amrstrong");
			
		}
		else
		{
			System.out.println("The number is not Amstrong");
		}
		return false;
				
	}
	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   q1 obj=new q1();
	   obj.armstrongCheck(num);
	}

}
