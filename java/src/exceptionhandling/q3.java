package exceptionhandling;
import java.util.Scanner;
public class q3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter your id:");
        Double balance=1000.02;
        long id=sc.nextLong();
        Double deposite=sc.nextDouble(); 
        balance+=deposite;
        System.out.println("Account Balance;"+balance);
        Double withdraw;
        try
        {
        	withdraw=sc.nextDouble();
        	if(withdraw>balance)
        	{
        		throw new InsufficientBalanceException("InsufficientBalanceException");
            }
         else if(withdraw<0)
        {
        	throw new IllegalBankTransactionException("IllegalBankTransactionException");
        }
	     }
        catch(InsufficientBalanceException a)
        {
        	System.out.println(a);
        }
        catch(IllegalBankTransactionException a)
        {
        	System.out.println(a);
        }
}
}
	
