package prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx1= new AnnotationConfigApplicationContext(Config.class);
		
		Message objA = (Message) ctx1.getBean("prototypeScope");
		objA.setMsg("Message set in obj A");
		System.out.println(objA.toString());
		
		Message objB = (Message) ctx1.getBean("prototypeScope");
//		objB.setMsg("Message set in obj A");
		System.out.println(objB.toString());
		
//		prototype bean scope
	}

}
