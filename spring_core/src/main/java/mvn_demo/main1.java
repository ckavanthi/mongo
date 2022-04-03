package mvn_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main1 {

	public static void main(String[] args) 
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("bean1.xml");
		
		address a= (address) context.getBean("addr");
		a.info();
		customer c = (customer) context.getBean("co");
		c.details();
				
	}

}
