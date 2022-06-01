package login_page;

import java.io.Serializable
;
public class psbean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String upwd;
	
	public psbean(String upwd) {
		super();
		this.upwd = upwd;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	

}
