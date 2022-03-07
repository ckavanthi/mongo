package datastructure;

import java.util.Scanner;

public class q3 {
public double simpleInterest(double principalAmount,int time,double interstRate)
{
	double SI;
	Scanner sc=new Scanner(System.in);
	principalAmount=sc.nextDouble();
	interstRate=sc.nextDouble();
	time=sc.nextInt();
	SI=(principalAmount*time*interstRate)/100;
	System.out.println("Simple Interst:"+SI);
	return SI;
}
	public double compoundInterest(double principalAmount,int time,double interestRate)
	{
		double CI;
		Scanner sc=new Scanner(System.in);
		principalAmount=sc.nextDouble();
		interestRate=sc.nextDouble();
		time=sc.nextInt();
		CI=principalAmount*Math.pow((1+interestRate),time)-principalAmount;
		System.out.println("Comound Interest:"+CI);
		return CI;
		
	}
public static void main(String[] args) 
    {
		q3 obj=new q3();
		obj.compoundInterest(0, 0, 0);
		obj.simpleInterest(0, 0, 0);
		// TODO Auto-generated method stub

	}

}
