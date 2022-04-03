package mvn_demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Draw5_8 
{
	public static void main(String[] args) 
	{
		
		  ApplicationContext context=new ClassPathXmlApplicationContext("beans5_8_6.xml"); 
		  
			  square s=(square)context.getBean("square"); 
			  rectangle re=(rectangle)context.getBean("rectangle"); 
			  s.area();
				
				  que5 t = (que5) context.getBean("abc");
				  t.print();
		          ques8 b = (ques8) context.getBean("be");
                  b.sys();
                  b.init();
                  b.dest();
                  b.initbeaninit();
                  b.destbeaninit();
                  ques6 properties=(ques6)context.getBean("ques6");
          		 System.out.println(properties.display());

        
	}
}
