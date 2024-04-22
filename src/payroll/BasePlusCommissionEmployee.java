package payroll;

public class BasePlusCommissionEmployee extends CommissionEmployee  {
   private CommissionEmployee commissionEmployee; // composition
   private double basePay;
   

   // six-argument constructor
   public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSale, double commissionRate, double basePay) {
      
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
