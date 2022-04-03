package mvn_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("mvn_demo")
public class config 
{
	@Bean
	public brand brr()
	{
		return new brand();
	}
}