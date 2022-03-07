package ex;
import java.lang.annotation.ElementType;

import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@interface oops 
{
  int age() default"None";
  String name();
}
@oops(name="sidhu")
class app
	{
	void run() 
	{
   	 System.out.println("HOW");
    }
	}
public class q1
{

 public static void main(String[] args)
 {
	 app v=new app();
	 v.run();
	 Class a=v.getClass();
	 oops b=(oops)q;
	 System.out.println(oops.b);
}
}
