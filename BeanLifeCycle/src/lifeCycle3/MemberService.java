package lifeCycle3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService implements InitializingBean, DisposableBean{
	
	private Member member;


	@Autowired
	public void setMember(Member member) {
		this.member = member;
	}


	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Destroy Method is called by DisposableBean!");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Init Method is called by InitializingBean!");
	} 
	

	

}
