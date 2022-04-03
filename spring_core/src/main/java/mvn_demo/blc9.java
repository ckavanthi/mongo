package mvn_demo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class blc9 
{
		private String message;

		
		   public void getMessage() 
		   {
			   System.out.println("Your Message : " + message);
		   }

		public void setMessage(String message) {
			this.message = message;
		}

		@PostConstruct
		   public void init(){
		      System.out.println("Bean is going through init.");
		   }
		   
		   @PreDestroy
		   public void destroy() {
		      System.out.println("Bean will destroy now.");
		   }

}

