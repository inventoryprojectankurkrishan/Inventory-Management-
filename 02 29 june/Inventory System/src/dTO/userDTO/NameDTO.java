package dTO.userDTO;

public class NameDTO {
	private String salutation;
	private String firstname;
	private String middlename;
	private String lastname;
	
	
	
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
	@Override
	public String toString() {
		return "NameDTO [salutation=" + salutation + ", firstname=" + firstname + ", middlename=" + middlename
				+ ", lastname=" + lastname + "]";
	}
}
