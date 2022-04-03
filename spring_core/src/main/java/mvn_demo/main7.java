package mvn_demo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main7 {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans7.xml");
		ques7 SpEL = (ques7) context.getBean("ques7");
		System.out.println(SpEL.Display());
		context.close();
	}

}
