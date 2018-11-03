package singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx1= new AnnotationConfigApplicationContext(Config.class);
		
		Message objA = ctx1.getBean(Message.class);
		objA.setMsg("Message set in obj A");
		System.out.println(objA.toString());
		
		Message objB = ctx1.getBean(Message.class);
//		objB.setMsg("Message set in obj A");
		System.out.println(objB.toString());
		
//		singleton bean scope
	}

}
