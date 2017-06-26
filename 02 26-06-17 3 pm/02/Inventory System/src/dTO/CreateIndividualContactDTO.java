package dTO;

public class CreateIndividualContactDTO {
	String contact_type;
	String salutation;
	String firstname;
	String middlename;
	String lastname;
	String gender;
	String phone;
	String emailid;
	String billing_address;
	String shipping_address;
	
	public String getContact_type() {
		return contact_type;
	}
	public void setContact_type(String contact_type) {
		this.contact_type = contact_type;
	}
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	public String getBilling_address() {
		return billing_address;
	}
	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}
	public String getShipping_address() {
		return shipping_address;
	}
	public void setShipping_address(String shipping_address) {
		this.shipping_address = shipping_address;
	}
	
	@Override
	public String toString() 
	{
		return "CreateIndividualContactDTO [contact_type=" + contact_type + ", salutation=" + salutation
				+ ", firstname=" + firstname + ", middlename=" + middlename + ", lastname=" + lastname + ", gender="
				+ gender + ", phone=" + phone + ", emailid=" + emailid + ", billing_address=" + billing_address
				+ ", shipping_address=" + shipping_address + "]";
	}
	
	
}
