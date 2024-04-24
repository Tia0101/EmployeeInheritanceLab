// Name: Tia Vanderyacht
//Date: 04/18/2024
// Class: CS 145 9:30am face to face
// Assignment: Lab 3 Employee inheritance.
// Purpose: Subclass to CommissionEmployee Class, Class is used to calculate earnings for a base employee plus commission
// Citation: This program references chapter 9 of the Deitel/Deitel-11th edition(Early Objects), w3schools.com, StackOverFlow.com and youtube

//Custom package made
package payroll;

public class BasePlusCommissionEmployee extends CommissionEmployee  {
   private CommissionEmployee commissionEmployee; // composition
   private double basePay;
   

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate, double basePay) {
         
      //Call to CommissionEmploy super class contstructor
         super(firstName, lastName, socialSecurityNumber, grossSale, commissionRate);
         
      if (basePay < 0.0) {
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
      }

      this.basePay = basePay;
   }

   // set base salary
   public void setBasePay(double basePay) {
      if (basePay < 0.0) {
         throw new IllegalArgumentException(
            "Base salary must be >= 0.0");
      }

      this.basePay = basePay;
   }

   // return base-salaried commission employee's base salary
   public double getBasePay() {
      return basePay;
   }

   // calculate base-salaried commission employee's earnings
   public double earnings() {
      return getBasePay() + commissionEmployee.earnings();
   } 

   // return String representation of BasePlusCommissionEmployee
   @Override
   public String toString() {
      return String.format("%s %s%n%s: %.2f", "base-salaried",
         commissionEmployee.toString(), "base salary", getBasePay());
   }
}
