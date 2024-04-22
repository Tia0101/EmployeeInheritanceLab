package payroll;
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber = "";

    public Employee(String firstName,String lastName,String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;

        if (socialSecurityNumber.length() != 11 || socialSecurityNumber.charAt(3) != '-' || socialSecurityNumber.charAt(6) !='-') {
            throw new IllegalArgumentException("Invalid fromat entered for Social security number ");
        }

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
        return  String.format("%s: %s %s%n%s: %s:",
        "Employee's name", getFirstName(), getLastName(),
        "Employee's social security number", getSocialSecurityNumber());
    }

    
}
