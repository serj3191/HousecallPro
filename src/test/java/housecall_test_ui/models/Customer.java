package housecall_test_ui.models;

import static housecall_test_ui.utilities.Utilities.fake;

public class Customer {

    private String firstName,lastName,mobilPhone,email;

    public Customer(){
        setFirstName();
        setLastName();
        setMobilPhone();
        setEmail();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        this.firstName = fake().name().firstName();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = fake().name().lastName();
    }

    public String getMobilPhone() {
        return mobilPhone;
    }

    public void setMobilPhone() {
        this.mobilPhone = "3475870531";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        this.email = fake().internet().emailAddress();
    }
}
