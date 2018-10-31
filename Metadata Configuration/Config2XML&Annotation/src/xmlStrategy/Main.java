package xmlStrategy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {


		//Member member = new Member();
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springConfig.xml");
		
		
		Member member= (Member) ctx.getBean(Member.class);
		MemberType type=(MemberType) ctx.getBean(MemberType.class);
		
		type.setTitle("Lecturer");
		member.setName("Sepideh");
		member.setFamily("Saljooghi");
		member.setType(type);
		System.out.println(member.toString());

	}

}
