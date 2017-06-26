package helper;

import java.sql.SQLException;

import dAO.CheckUseridPasswordDAO;
import dAO.LoginDAO;
import dAO.SetLastLoginDAO;
import dTO.LoginDTO;

public class LoginHelper {
	public boolean checkUseridPassword(LoginDTO loginDTO)
	{
		boolean result=false;
		CheckUseridPasswordDAO checkUseridPasswordDAO = new CheckUseridPasswordDAO();
		
		try 
		{
			result=checkUseridPasswordDAO.checkUserLogin(loginDTO);
		}
		
		catch (SQLException e)
		{
			e.printStackTrace();
			System.out.println("SQL Exception generated in checkUser in LoginHelper");
		}
		return result;
	}
	
	
	public boolean setLastLogin(String userid)
	{
		boolean result=false;
		SetLastLoginDAO setLastLoginDAO = new SetLastLoginDAO();
		try 
		{
			result=setLastLoginDAO.setUserLastLogin(userid);
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
			System.out.println("SQL Exception generated in setLastLogin in LoginHelper");
		}
		
		return result;
	}
	
	
	public boolean doLogin()
	{
		boolean result=true;
		System.out.println("DoLogin function called");
		LoginDAO loginDAO = new LoginDAO();
		
		
		
		return result;
		
	}
	
	
}
