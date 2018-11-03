package initStrategy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component @Lazy(value=true)
public class LazyBean{
	public LazyBean() {
		System.out.println("Lazy Bean Created!");

	}
	
}
