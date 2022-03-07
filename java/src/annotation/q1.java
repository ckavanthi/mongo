package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
}
class app{
	@Test
     void run() {
    	 System.out.println("HOW");
     }
}
public class q1 {
	public static void main(String[] args) {
		app s = new app();
		s.run();
	}
}
