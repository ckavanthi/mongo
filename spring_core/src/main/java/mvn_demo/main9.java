package mvn_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Avanthi
 *
 */
public class main9 
{
	public static void main( String[] args ){
    
    ApplicationContext context = new ClassPathXmlApplicationContext("beans9.xml");
     
    blc9 q = (blc9) context.getBean("bl");
    q.getMessage();
}


}
