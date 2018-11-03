package initStrategy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
//		EagerBean eg = ctx.getBean(EagerBean.class);
		LazyBean lz = ctx.getBean(LazyBean.class);
	}

}
