package service;

import java.sql.SQLException;

import com.helper.RegisterHelper;

import dAO.RegisterDAO;
import dTO.RegisterDTO;

public class RegisterService {
	public boolean registerUserService(RegisterDTO userDTO) throws ClassNotFoundException, SQLException
	{
		boolean getResult=false;
		RegisterHelper registerHelper =new RegisterHelper();
		getResult=registerHelper.doRegister(userDTO);
		
		return getResult;
	}
}
