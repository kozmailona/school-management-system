package org.fasttrackit.schoolmanagementsystem.domain;

public class Contact {

    private String phoneNumberSecretariat;
    private String emailAddressSecretariat;
    private String websiteURL;

    public Contact(String phoneNumberSecretariat, String emailAddressSecretariat, String websiteURL) {
        this.phoneNumberSecretariat = phoneNumberSecretariat;
        this.emailAddressSecretariat = emailAddressSecretariat;
        this.websiteURL = websiteURL;
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
