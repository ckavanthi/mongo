package mvn_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main2 {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("bean2.xml");
		question q = (question) context.getBean("ques");
		q.print();

	}

}
