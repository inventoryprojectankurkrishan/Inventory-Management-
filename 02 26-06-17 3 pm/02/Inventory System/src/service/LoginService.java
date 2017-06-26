package service;

import dTO.LoginDTO;
import helper.LoginHelper;

public class LoginService {
		public boolean doLogin(LoginDTO loginDTO)
		{
			boolean result=false;
			LoginHelper loginHelper = new LoginHelper();
			boolean result1=loginHelper.checkUseridPassword(loginDTO);
		
			if(result1)
						{
							boolean result2=loginHelper.setLastLogin(loginDTO.getUserid());
							if(result2)
								{	
									boolean result3=loginHelper.doLogin();
									if(result3)
										{
											result=true;
										}
								}
						}				
			return result;
		}
}
