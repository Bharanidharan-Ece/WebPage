package login_page;

import java.io.Serializable;

public class LoginBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String uname;
    private String upwd;
    
    public LoginBean(String uname, String upwd) {
    	super();
    	this.uname = uname;
    	this.upwd = upwd;
    	
    }
	public LoginBean(String upwd) {
		// TODO Auto-generated constructor stub
		
	        this.upwd = upwd;
	}

    public String getuname() {
        return uname;
    }
    public void setUsername(String uname) {
        this.uname = uname;
    }
    public String getupwd() {
        return upwd;
    }
    public void setPassword(String upwd) {
        this.upwd = upwd;
    }
    
    public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	
    

}