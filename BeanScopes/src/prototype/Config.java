package prototype;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration

public class Config {
	@Bean(name="singletonScope")@Scope("singletom")
	public Message msg1()
	{
		return new Message();
	}
	
	@Bean(name="prototypeScope")@Scope("prototype")
	public Message msg2()
	{
		return new Message();
	}
}
