package action;
import java.sql.SQLException;
import com.opensymphony.xwork2.ActionSupport;
import dTO.NameDTO;
import dTO.RegisterDTO;
import service.RegisterService;

public class RegisterAC extends ActionSupport {
	String salutation;
	String firstname;
	String middlename;
	String lastname;
	String dateofbirth;
	String gender;
	String userid;
	String password;
	String phone;
	String emailid;
	String address;
	
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	public String getDateofbirth() {
	return dateofbirth;
	}
	public void setDateofbirth(String dateOfBirth) {
		this.dateofbirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddlename() {
		return middlename;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String execute() throws ClassNotFoundException, SQLException
	{
		String result=ERROR;
//		String resultString=ERROR;
		RegisterDTO registerDTO=createRegisterDTO();
		RegisterService registeruser = new RegisterService();
		if(registeruser.registerUserService(registerDTO))
			result=SUCCESS;	
		
		return result;
	}
	
	public RegisterDTO createRegisterDTO()
	{	RegisterDTO userDTO=new RegisterDTO();
		NameDTO nameDTO = createNameDTO();
		userDTO.setNameDTO(nameDTO);
		userDTO.setDateOfBirth(dateofbirth);
		userDTO.setGender(gender);
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		userDTO.setPhone(phone);
		userDTO.setEmailid(emailid);
		userDTO.setAddress(address);
		return userDTO;
	}
	public NameDTO createNameDTO()
	{
		NameDTO nameDTO =new NameDTO();
		nameDTO.setSalutation(salutation);
		nameDTO.setFirstname(firstname);
		nameDTO.setMiddlename(middlename);
		nameDTO.setLastname(lastname);
		return nameDTO;
	}
	
}
