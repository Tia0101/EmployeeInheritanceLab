import java.util.ArrayList;

import payroll.BasePlusCommissionEmployee;
import payroll.EmployeeInfo;

public class BasePlusCommissionEmployeeTestApp {
    

    public static void main(String[] args) {

        ArrayList<Object> employeeInfo = EmployeeInfo.getEmployeeInfo();
        String firstName = (String) employeeInfo.get(0);
        String lastName = (String) employeeInfo.get(1);
        String socialNum = (String) employeeInfo.get(2);
        double grossSale = (double) employeeInfo.get(3);
        double commissionRate = (double) employeeInfo.get(4);
        double basePay = (double) employeeInfo.get(5);

        
        BasePlusCommissionEmployee  employee =  new BasePlusCommissionEmployee(firstName,lastName,socialNum,grossSale,commissionRate,basePay);

        System.out.println("First name: " + employee.getFirstName());
        System.out.println("Last name: " + employee.getLastName());
        System.out.println("Social security number: " + employee.getSocialSecurityNumber());
        System.out.println("Gross sales: " + employee.getGrossSale());
        System.out.println("Commission rate: " + employee.getCommissionRate());
        System.out.println("Base salary: " + employee.getBasePay());
    }
}

