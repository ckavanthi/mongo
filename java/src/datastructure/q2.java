package datastructure;

public class q2 
{

	public static void main(String[] args) 
	{
	 int n1,n2,n3,c;
	 for(int i=100;i<=999;i++)
	 {
	   c=i;
	   n1=c%10;
	   c=c/10;
	   n2=c%10;
	   c=c/10;
	   n3=c%10;
	   int b=(n1*n1*n1)+(n2*n2*n2)+(n3*n3*n3);
	   if(i==b)
	   {
		   System.out.println(i+"   is a Amstrong");
	   }
	   
	 }

	}

}
