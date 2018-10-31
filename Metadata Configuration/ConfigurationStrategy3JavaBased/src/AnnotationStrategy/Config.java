package AnnotationStrategy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Member getMember() {
		return new Member();
	}
	@Bean(name="typeid")
	public MemberType getMemberType() {
		return new MemberType();
	}

}
