package lifeCycle2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Config {
	
	@Bean(initMethod = "myInitMethod", destroyMethod= "myDestroyMethod")
	public MemberService ms() {
		return new MemberService();
		
	}

}
