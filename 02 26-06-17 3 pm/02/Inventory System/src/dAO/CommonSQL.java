package dAO;

public class CommonSQL {

	public static final String Register_User_SQL="insert into user_master (salutation, first_name, middle_name, last_name"
			+ ", date_of_birth , gender, userid, password , phone , email_id, address)"
			+ "values (?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?)";
	public static final String GET_USER_ID = "select * from user_master where userid = ? ";
	
	public static final String CHECK_USER_ID_PASSWORD = "select userid , password, status from user_master where userid = ?";
	public static final String Set_User_Last_Login_SQL = "update user_master set lastlogin = ? where userid = ?";
	public static final String CREATE_INDIVIDUAL_CONTACT_SQL="insert into contact_individual (contact_type, salutation,"
			+ " firstname, middlename, lastname, gender, phone, emailid, billing_address, shipping_address) values"
			+ " (?,?,?,?,?,?,?,?,?,?)";
	
	public static final String GET_CONTACT_LIST_SQL="select * from contact_individual";
	
	
}
