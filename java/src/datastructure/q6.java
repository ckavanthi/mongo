package datastructure;


import java.util.Scanner;
class q6
{
  String userid="Ajay",password="password";
  public String loginUser(String user,String pass)
  {
	  int attempts=3;
	  if(attempts!=0)
	  {
		  if(userid==user&&password==pass)
		  {
			  System.out.println("welcome Ajay");
		  }
		  else
		  {
			  System.out.println("you have entered wrong credentials,please enter the right credentials");
		  }
		  attempts++;
	  }
	  else
	  {
		  System.out.println("Content Admin");
	  }
	return pass;
  }
	  public static void main(String[] args)
	   { Scanner sc=new Scanner(System.in);
		 q6 obj=new q6();
		 String userId=sc.next();
		 String passworD=sc.next();
		 obj.loginUser(userId,passworD);
		}

	

}
