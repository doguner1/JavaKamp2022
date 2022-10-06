package oop1;

public class CorporateCustomer extends Customer{
	//CorporateCustomer bir customerder. Onun referansını tutar
	private String companyNameString;
	private String lastName;
	
	
	public String getCompanyNameString() {
		return companyNameString;
	}
	public void setCompanyNameString(String companyNameString) {
		this.companyNameString = companyNameString;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
