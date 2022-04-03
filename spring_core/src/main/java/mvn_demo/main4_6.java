package mvn_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main4_6 {

	private static ApplicationContext context;

	public static void main(String[] args) 
	{  
	    context = new AnnotationConfigApplicationContext(config.class);
	    ApplicationContext context = new  ClassPathXmlApplicationContext("ques4_6.xml");
	    ques4 s = (ques4) context.getBean(ques4.class);
        s.run();
        brand b= (brand) context.getBean(brand.class);
        b.bren();
        bike a = (bike) context.getBean(bike.class);
        a.po();
       ques6 properties=(ques6)context.getBean("ques6");
		System.out.println(properties.display());

	}

}
