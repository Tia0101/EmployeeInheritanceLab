// Name: Tia Vanderyacht
//Date: 04/18/2024
// Class: CS 145 9:30am face to face
// Assignment: Lab 3 Employee inheritance.
// Purpose:"Utility" Class created to collect user input and store in an arraylist to return for parameters.
// Citation:This program references chapter 7 of the Deitel/Deitel-11th edition(Early Objects), w3schools.com, StackOverFlow.com, baeldung.com and youtube

//See this whole, checked with you to make sure this was extra credit.
package payroll;
import java.util.ArrayList;
import java.util.Scanner;

public final class EmployeeInfo {
    private EmployeeInfo()  { }// private constructor so one is not created by default
    //Method that prompts for user input and stores the data in an arraylist. This method returns the arraylist.
    public static ArrayList<Object> collectEmployeeInfo() {
        Scanner input = new Scanner(System.in);
        ArrayList<Object> employeeInfoList = new ArrayList<>();

        System.out.println("Please enter employee's first name");
        String firstName = input.next();

        System.out.println("Please enter employee's last name");
        String lastName = input.next();
        System.out.println();

        System.out.println("Please enter employee's social security number");
        String  socialNum = input.next();
        
        System.out.println("Please enter the gross sale amount");
        double grossSale = input.nextDouble();
        System.out.println();
        
        System.out.println("Please enter  the commission rate (between 0.1 - 0.9 percent)");
        double commissionRate = input.nextDouble();
        System.out.println();

        System.out.println("Please enter employee's base salary");
        double basePay = input.nextDouble();
        System.out.println();
        
        //Adding the user input to the arraylist
        employeeInfoList.add(firstName);
        employeeInfoList.add(lastName);
        employeeInfoList.add(socialNum);
        employeeInfoList.add(grossSale);
        employeeInfoList.add(commissionRate);
        employeeInfoList.add(basePay);

        return employeeInfoList;

        
    }

}