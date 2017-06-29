package service;

import dTO.DashboardDTO;
import dTO.LoginDTO;
import dTO.LoginResultDTO;
import helper.LoginHelper;

public class LoginService {
		public LoginResultDTO doLogin(LoginDTO loginDTO)
		{
			boolean result=false;
			LoginResultDTO loginResultDTO=null;
			DashboardDTO dashboardDTO=null;
			LoginHelper loginHelper = new LoginHelper();
			if(loginHelper.checkUseridPassword(loginDTO))
						{	
							dashboardDTO=loginHelper.doLogin(loginDTO.getUserid());
							if(dashboardDTO!=null)
								{
									if(loginHelper.setLastLogin(loginDTO.getUserid()))
										{	
											result=true;
											loginResultDTO =new LoginResultDTO();
											loginResultDTO.setDashboardDTO(dashboardDTO);
											loginResultDTO.setResult(result);
										}
								}	
						}						
			return loginResultDTO;
		}
}
