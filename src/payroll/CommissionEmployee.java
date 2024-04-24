// Name: Tia Vanderyacht
//Date: 04/18/2024
// Class: CS 145 9:30am face to face
// Assignment: Lab 3 Employee inheritance.
// Purpose: Subclass to the Employee super class, Class used to calculate commission from sales for commission only employee's
// Citation: This program references chapter 9 of the Deitel/Deitel-11th edition(Early Objects), w3schools.com, StackOverFlow.com and youtube

//Custom package made
package payroll;

public class CommissionEmployee extends Employee {
   private double grossSale; // gross weekly sales
   private double commissionRate; // commission percentage
   private Employee employee;
   // five-argument constructor
   public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate) {
      
      //Call to Employee super class constructor
      super(firstName, lastName, socialSecurityNumber);

      // if grossSales is invalid throw exception
      if (grossSale < 0.0) {
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
      }

      // if commissionRate is invalid throw exception
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }
      this.grossSale = grossSale;
      this.commissionRate = commissionRate;
   } 

   // set gross sales amount
   public void setGrossSale() {
      if (grossSale < 0.0) {
         throw new IllegalArgumentException(
            "Gross sales must be >= 0.0");
      }

      this.grossSale = grossSale;
   } 

   // return gross sales amount
   public double getGrossSale() {
      return grossSale;
   } 

   // set commission rate
   public void setCommissionRate(double commissionRate) {
      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
         throw new IllegalArgumentException(
            "Commission rate must be > 0.0 and < 1.0");
      }

      this.commissionRate = commissionRate;
   } 

   // return commission rate
   public double getCommissionRate() {
      return commissionRate;
   }

   // calculate earnings
   public double earnings() {
      return getCommissionRate() * getGrossSale();
   } 

  
   // return String representation of CommissionEmployee object
   @Override 
   public String toString() {
      return String.format("%n%s%n%s: %.2f%n%s: %.2f", 
         employee.toString(),
         "Gross sales:", getGrossSale(), 
         "Commission rate:", getCommissionRate());
   } 
}
