package dAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchContactDataDAO {
	
	Connection con = null;
	ResultSet rs1 =null;
	PreparedStatement pstmt1 =null;
	public ResultSet fetchData(){
	
		try {
			con= CommonDAO.getConnection();
			pstmt1=con.prepareStatement(CommonSQL.GET_CONTACT_LIST_SQL);
			rs1=pstmt1.executeQuery();
			
			
			
			
		} catch (ClassNotFoundException e)
		{
			
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		
		return rs1;
		
		
		
	}

}
