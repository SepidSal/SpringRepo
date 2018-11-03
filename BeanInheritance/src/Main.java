import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		Parent p = (Parent) ctx.getBean("parentid");
		System.out.println(p.toString());
		
		Child ch = (Child) ctx.getBean("childid");
		ch.setName("childName");
		System.out.println(ch.toString());

	}

}
