package payroll;
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber = "";

    public Employee(String firstName,String lastName,String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;

    }
    public void setFirstname() {
        this.firstName = firstName;
    }

    public void setLastname() {
        this.lastName = lastName;
    }

    public void setSocialSecurityNUmber() {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public String toString() {
        return  String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", 
        "Employee's name", getFirstName(), getLastName(), 
        "Employee's social security number", getSocialSecurityNumber());
    }

    
}