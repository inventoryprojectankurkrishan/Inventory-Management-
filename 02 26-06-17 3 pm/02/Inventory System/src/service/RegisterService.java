package service;

import java.sql.SQLException;
import dTO.RegisterDTO;
import helper.RegisterHelper;

public class RegisterService {
	public boolean registerUserService(RegisterDTO RegisterUserDTO) throws ClassNotFoundException, SQLException
	{
		boolean getResult=false;
		RegisterHelper registerHelper =new RegisterHelper();
		getResult=registerHelper.doRegister(RegisterUserDTO);
		
		return getResult;
	}
}
