package lifeCycle2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService {
	
	private Member member;


	@Autowired
	public void setMember(Member member) {
		this.member = member;
	} 
	
	public void myInitMethod() {
		System.out.println("My Init Method is called!");
		this.member.setName("Name is set!");		
	}
	public void myDestroyMethod() {
		System.out.println("My Destroy Method is called!");
	}

	

}
