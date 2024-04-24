// Name: Tia Vanderyacht
//Date: 04/18/2024
// Class: CS 145 9:30am face to face
// Assignment: Lab 3 Employee inheritance.
// Purpose: Superclass for CommissionEmployee 
// Citation: This program references chapter 9 of the Deitel/Deitel-11th edition(Early Objects), w3schools.com, StackOverFlow.com and youtube

//Custom package created for payroll
package payroll;
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    //Three argument constructor
    public Employee(String firstName,String lastName,String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;

        //Validation for social security input
        if (socialSecurityNumber.length() != 11 || socialSecurityNumber.charAt(3) != '-' || socialSecurityNumber.charAt(6) !='-') {
            throw new IllegalArgumentException("Invalid format entered for Social security number ");
        }

    }
    //Accessor for first name, Returns first name
    public String getFirstName() {
        return firstName;
    }
    //Accessor for last name, returns last name
    public String getLastName() {
        return lastName;
    }
    //Accessor for social security number, returns social security number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    //return String
    @Override
    public String toString() {
        return  String.format("%s: %s %s%n%s: %s:",
        "Employee's name", getFirstName(), getLastName(),
        "Employee's social security number", getSocialSecurityNumber());
    }

    
}
