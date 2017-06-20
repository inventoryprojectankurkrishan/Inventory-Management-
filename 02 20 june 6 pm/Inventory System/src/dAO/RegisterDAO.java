package dAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dTO.RegisterDTO;

public class RegisterDAO 
{
	public boolean doRegister(RegisterDTO userDTO) throws SQLException, ClassNotFoundException
	{
		boolean getResult=false;
		Connection con = null;
		PreparedStatement pstmt1 = null;
	
	
		try
		{	
			con = CommonDAO.getConnection();
			pstmt1=con.prepareStatement(CommonSQL.Register_User_SQL);
			pstmt1.setString(1, userDTO.getNameDTO().getSalutation());
			pstmt1.setString(2, userDTO.getNameDTO().getFirstname());
			pstmt1.setString(3, userDTO.getNameDTO().getMiddlename());
			pstmt1.setString(4, userDTO.getNameDTO().getLastname());
			pstmt1.setString (5, userDTO.getDateOfBirth());
			pstmt1.setString(6, userDTO.getGender());
			pstmt1.setString(7, userDTO.getUserid());
			pstmt1.setString(8, userDTO.getPassword());
			pstmt1.setString(9, userDTO.getPhone());
			pstmt1.setString(10, userDTO.getEmailid());
			pstmt1.setString(11,"N");
			
			int noOfRowsEffected1 = pstmt1.executeUpdate();
			if(noOfRowsEffected1>0)
			{
			getResult=true;	
			}
		}
//		catch(ClassNotFoundException e)
//		{	//e.printStackTrace();
//			System.out.println("Class not found exception generated");
//		}
//		catch(SQLException e)
//		{
//			//e.printStackTrace();
//			System.out.println("SQL exception generated");
//			
//		}
		finally
		{
		
			if(pstmt1!=null)
			{
				pstmt1.close();
			}
			
			if(con!=null)
			{
				con.close();
			}
		}

		return getResult;
			
	}
}
