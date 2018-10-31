package xmlStrategy;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {

	public static void main(String[] args) {


		//Member member = new Member();
		
		
		@SuppressWarnings("deprecation")
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("springConfig.xml"));
		Member member = (Member) factory.getBean("memberid");
		
		
		/*ApplicationContext ctx = new ClassPathXmlApplicationContext ("springConfig.xml");
		Member member = (Member) ctx.getBean("memberid");
		*/
		
		member.setName("Sepideh");
		member.setFamily("Saljooghi");
		System.out.println(member.toString());

	}

}
