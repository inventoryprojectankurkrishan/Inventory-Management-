package action;

import com.opensymphony.xwork2.ActionSupport;

import dTO.CreateIndividualContactDTO;
import service.CreateIndividualService;

public class CreateIndividualCustomerContactAC extends ActionSupport {
	
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
	public String execute()
	{
		String getResult= ERROR;
		 
		CreateIndividualContactDTO IndContactDTO = createIndividual();
		
		CreateIndividualService individualService = new CreateIndividualService();
		
		if(individualService.doindividualService(IndContactDTO))
		{
			getResult=SUCCESS;
		}
		
		return getResult;
		
	}
	public CreateIndividualContactDTO createIndividual(){
		CreateIndividualContactDTO IndContactDTO = new CreateIndividualContactDTO();
		IndContactDTO.setContact_type(contact_type);
		IndContactDTO.setFirstname(firstname);
		IndContactDTO.setMiddlename(middlename);
		IndContactDTO.setLastname(lastname);
		IndContactDTO.setSalutation(salutation);
		IndContactDTO.setGender(gender);
		IndContactDTO.setPhone(phone);
		IndContactDTO.setEmailid(emailid);
		IndContactDTO.setBilling_address(billing_address);
		IndContactDTO.setShipping_address(shipping_address);
		return IndContactDTO;
	}
	
	
	

}
