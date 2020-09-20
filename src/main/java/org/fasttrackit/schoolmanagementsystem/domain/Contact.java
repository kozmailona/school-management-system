package org.fasttrackit.schoolmanagementsystem.domain;

public class Contact {
	
	private Long id;

    private String phoneNumberSecretariat;
    
    private String emailAddressSecretariat;
    
    private String websiteURL;

	public Contact(Long id, String phoneNumberSecretariat, String emailAddressSecretariat, String websiteURL) {
		this.id = id;
		this.phoneNumberSecretariat = phoneNumberSecretariat;
		this.emailAddressSecretariat = emailAddressSecretariat;
		this.websiteURL = websiteURL;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhoneNumberSecretariat() {
		return phoneNumberSecretariat;
	}

	public void setPhoneNumberSecretariat(String phoneNumberSecretariat) {
		this.phoneNumberSecretariat = phoneNumberSecretariat;
	}

	public String getEmailAddressSecretariat() {
		return emailAddressSecretariat;
	}

	public void setEmailAddressSecretariat(String emailAddressSecretariat) {
		this.emailAddressSecretariat = emailAddressSecretariat;
	}

	public String getWebsiteURL() {
		return websiteURL;
	}

	public void setWebsiteURL(String websiteURL) {
		this.websiteURL = websiteURL;
	}

}
