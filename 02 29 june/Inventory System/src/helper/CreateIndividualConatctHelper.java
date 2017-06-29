package helper;

import java.sql.SQLException;

import dAO.CreateIndividualContactDAO;
import dTO.CreateIndividualContactDTO;

public class CreateIndividualConatctHelper {

	public boolean createIndContactHelper(CreateIndividualContactDTO indContactDTO) {
		boolean result = false;
		CreateIndividualContactDAO individualDAO = new CreateIndividualContactDAO();
		
		try 
		{
			result =  individualDAO.createIndContactDAO(indContactDTO);
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return result ;
	}
}
