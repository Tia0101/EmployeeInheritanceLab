// Name: Tia Vanderyacht
//Date: 04/18/2024
// Class: CS 145 9:30am face to face
// Assignment: Lab 3 Employee inheritance.
// Purpose: Test App for BasePlusCommissionEmployee. This is collect user data and input them as parameters for the BasePlusCommissionEmployee class,
//and show the output using getter(Accessor)methods of the BasePlusCommissionEmployee subclass.
// Citation: This program references chapter 9 of the Deitel/Deitel-11th edition(Early Objects), w3schools.com, StackOverFlow.com and youtube

//Imports Arraylist for Employee info class
import java.util.ArrayList;

//Import for Payroll custom package.
import payroll.BasePlusCommissionEmployee;
import payroll.EmployeeInfo;

public class BasePlusCommissionEmployeeTestApp {
    

    public static void main(String[] args) {
        
        ArrayList<Object> employeeInfo = EmployeeInfo.getEmployeeInfo();//ArrayList object created from EmployeeInfo created for user input
        //Parsing out variables from user input from the array list return so they can be used as the parameters
        String firstName = (String) employeeInfo.get(0);
        String lastName = (String) employeeInfo.get(1);
        String socialNum = (String) employeeInfo.get(2);
        double grossSale = (double) employeeInfo.get(3);
        double commissionRate = (double) employeeInfo.get(4);
        double basePay = (double) employeeInfo.get(5);

        //BasePlusCommissionEmployee class object created
        BasePlusCommissionEmployee  employee =  new BasePlusCommissionEmployee(firstName,lastName,socialNum,grossSale,commissionRate,basePay);
        //Output to show subclass accessor methods are working.
        System.out.println("First name: " + employee.getFirstName());
        System.out.println("Last name: " + employee.getLastName());
        System.out.println("Social security number: " + employee.getSocialSecurityNumber());
        System.out.println("Gross sales: " + employee.getGrossSale());
        System.out.println("Commission rate: " + employee.getCommissionRate());
        System.out.println("Base salary: " + employee.getBasePay());
    }
}

