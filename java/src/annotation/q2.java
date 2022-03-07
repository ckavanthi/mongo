package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.Annotation;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info
{
int AuthorID();
String Author()default"None";
String Supervisor() default"None";
String Date();
String Time();
String Version();
String Description() default"NA";
}
@info(AuthorID=1818,Author="Avi",Date="12-04-2022",Time="8:00",Version="Java 11")
class developer
{
	void dev() 
	{
		System.out.println("Hello");
	}
}
public class q2 
{
	public static void main(String[] args)
	  {
		
	developer s = new developer();
	s.dev();
    Class a = s.getClass();
    java.lang.annotation.Annotation p = a.getAnnotation(info.class);
    info i = (info)p;
    System.out.println(i);

}
}