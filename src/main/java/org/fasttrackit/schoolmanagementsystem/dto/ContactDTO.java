package org.fasttrackit.schoolmanagementsystem.dto;

public class ContactDTO {

    private Long id;

    private String phoneNumberSecretariat;

    private String emailAddressSecretariat;

    private String websiteURL;

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

    @Override
    public String toString() {
        return "ContactDTO{" +
                "id=" + id +
                ", phoneNumberSecretariat='" + phoneNumberSecretariat + '\'' +
                ", emailAddressSecretariat='" + emailAddressSecretariat + '\'' +
                ", websiteURL='" + websiteURL + '\'' +
                '}';
    }
}
