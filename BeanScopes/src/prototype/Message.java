package prototype;

import org.springframework.stereotype.Component;

public class Message {

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Message [msg=" + msg + "]";
	}
	
	
}
