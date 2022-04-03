package mvn_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main10 {

	public static void main(String[] args) 
	{
		AbstractApplicationContext  context = new ClassPathXmlApplicationContext("beans10.xml");
		ApplicationContextAwareTest appcontext= (ApplicationContextAwareTest)context.getBean("app");
		ApplicationContext appCon =appcontext.getContext();	
		 helloworld obj = (helloworld) context.getBean("hello");
		  obj.print();	
		      context.registerShutdownHook();

	}

}
