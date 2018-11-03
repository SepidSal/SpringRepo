package lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService {
	
	private Member member;


	@Autowired
	public void setMember(Member member) {
		this.member = member;
	} 
	
	@PostConstruct
	public void initMethod() {
		System.out.println("Init Method is called by @PostConstruct!");
		this.member.setName("Name is set by @PostConstruct!");
	} 
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Destroy Method is called by @PreDestroy!");

	}
	

}
