package helper;

import java.sql.SQLException;

import dAO.RegisterDAO;
import dTO.RegisterDTO;

public class RegisterHelper {

	public boolean doRegister(RegisterDTO RegisterUserDTO) throws ClassNotFoundException, SQLException {
		boolean getresult = false;
		//String getStringResult = "ERROR";
		RegisterDAO registerDAO = new RegisterDAO();
		getresult=registerDAO.doRegister(RegisterUserDTO);
		return getresult;
	}

}
