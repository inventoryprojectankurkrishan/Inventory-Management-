package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import dTO.DashboardDTO;
import dTO.LoginDTO;
import dTO.LoginResultDTO;
import service.LoginService;

public class LoginAC extends ActionSupport{
	String userid;
	String password;
	List <DashboardDTO> list = null; 
	
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
	public List<DashboardDTO> getList() {
		return list;
	}
	public void setList(List<DashboardDTO> list) {
		this.list = list;
	}
	@Override
	public String execute()
	{	
		String result=ERROR;
		LoginResultDTO loginResultDTO=null;
		DashboardDTO dashboardDTO=null;
		
		LoginDTO loginDTO = new LoginDTO();
		loginDTO.setUserid(userid);
		loginDTO.setPassword(password);
	
		LoginService loginService=new LoginService();
		
		loginResultDTO=loginService.doLogin(loginDTO);
		if(loginResultDTO!=null)
		{	System.out.println("loginService.doLogin successful");
			if(loginResultDTO.getResult())
			{	
				list = new ArrayList<DashboardDTO>();
				dashboardDTO=loginResultDTO.getDashboardDTO();
				System.out.println(dashboardDTO);
				result=SUCCESS;
				list.add(dashboardDTO);
			}
		}
		
		return result;
	}
}
