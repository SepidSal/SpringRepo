package lifeCycle2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		System.out.println("context is initilized!");
		ctx.close();
		System.out.println("context is closed!");

	}

}
