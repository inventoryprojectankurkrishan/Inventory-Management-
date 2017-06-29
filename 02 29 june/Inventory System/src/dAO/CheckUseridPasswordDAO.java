package dAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dTO.LoginDTO;

public class CheckUseridPasswordDAO {

		public boolean checkUserLogin(LoginDTO loginUserDTO) throws SQLException
		{
			boolean getResult=false;
			//String result="error";
			Connection con = null;
		
			PreparedStatement pstmt1 =null;
			ResultSet rs1 =null;
			try
			{	
				con = CommonDAO.getConnection();
				
				pstmt1=con.prepareStatement(CommonSQL.CHECK_USER_ID_PASSWORD);
				pstmt1.setString(1, loginUserDTO.getUserid());
				rs1=pstmt1.executeQuery();
				
				String db_userid="NULL";
				String db_password="NULL";
				String db_status="NULL";
				if(rs1.first())
					{
						db_userid =rs1.getString("userid");
						db_password=rs1.getString("password");
						db_status=rs1.getString("status");

						if(db_userid.equals(loginUserDTO.getUserid()))
							{
								if(db_password.equals(loginUserDTO.getPassword()))
									{
						
										System.out.println("User Identity is Confirmed");
										
										if(db_status.equals("Y"))
											{	
												getResult=true;
												System.out.println("User Status is "+db_status);
											}
										else
											{	
												getResult=false;
												System.out.println("User Status is "+db_status);
												System.out.println("User cannot login ");	
											}
									}
							}
					}
			} 
			
			catch (ClassNotFoundException e) 
			{
				e.printStackTrace();
				System.out.println("ClassNotFound Exception in checkUserLogin in CheckUserDAO");
			}
			catch (SQLException e)
			{
				e.printStackTrace();
				System.out.println("SQL Exception in checkUserLogin in CheckUserDAO");
			}	
			
			finally
			{	
				
				if(rs1!=null)
				{
					rs1.close();
				}
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
