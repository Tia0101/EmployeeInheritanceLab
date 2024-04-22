package payroll;
import java.util.ArrayList;
import java.util.Scanner;
public class EmployeeInfo {
    private ArrayList<Object> employeeInfoList;

    public EmployeeInfo (ArrayList<Object> employeeInfoList) {
        this.employeeInfoList = employeeInfoList;
    }

    public static ArrayList<Object> getEmployeeInfo() {
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

        employeeInfoList.add(firstName);
        employeeInfoList.add(lastName);
        employeeInfoList.add(socialNum);
        employeeInfoList.add(grossSale);
        employeeInfoList.add(commissionRate);
        employeeInfoList.add(basePay);

        return employeeInfoList;

        
    }

}