package action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAC extends ActionSupport{
	String userid;
	String password;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute()
	{
		return SUCCESS;
	}
}
