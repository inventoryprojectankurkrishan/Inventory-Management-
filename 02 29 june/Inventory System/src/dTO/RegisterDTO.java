package dTO;

import dTO.userDTO.NameDTO;

public class RegisterDTO {
	private NameDTO nameDTO;
	private String dateOfBirth;
	private String gender;
	private String userid;
	private String password;
	private String phone;
	private String emailid;
	private String address;
	
	
	public NameDTO getNameDTO() {
		return nameDTO;
	}
	public void setNameDTO(NameDTO nameDTO) {
		this.nameDTO = nameDTO;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String toString() 
	{
		return "RegisterDTO [nameDTO=" + nameDTO + ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", userid="
				+ userid + ", password=" + password + ", phone=" + phone + ", emailid=" + emailid + ", address="
				+ address + "]";
	}
	
}
