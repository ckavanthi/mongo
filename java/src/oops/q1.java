package oops;
public class q1
{ 

	class SingletonInheritanceCheck
	{
	private SingletonInheritanceCheck() {}
	}
	class hello extends SingletonInheritanceCheck
	{
		void SingletonInheritanceCheck()		
		{
			
		}
	}
	
   public static void main(String[] args) 
	{   
	   SingletonInheritanceCheck obj1=new SingletonInheritanceCheck();
		SingletonInheritanceCheck obj2=new hello();
	}
}


