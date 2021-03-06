/** 
 *  This class is concrete and inherits from the abstract superclass
 *  Employee. We specialize the toString method by indicating the
 *  monthly salary.  Since in the superclass Employee the method
 *  getPaymentAmount() is abstract, we must give in the
 *  MonthlyEmployee class an implementation for paymentAmount(). It
 *  just returns the monthly salary.
 *
 *  @version 2018-12-06     revised by Frances A. Laureano De Leon
 *  @author Manfred Kerber
 */

public class MonthlyEmployee extends Employee{
	/**
     *  Additional field variable monthlySalary.
     */
    private double monthlySalary;

    /**
     *  The constructor for an employee with a monthly salary has the
     *  three fields of an Employee plus the field of the
     *  monthlySalary, which is set at construction.
     *  @param firstName The first name of the employee.
     *  @param lastName The last name of the employee.
     *  @param nI The national insurance number of the employee.
     *  @param monthlySalary The monthly salary of the employee.
     */
    public MonthlyEmployee(String firstName, String lastName, 
                           String nI, double monthlySalary) {
        super(firstName, lastName, nI); // must come first
        this.monthlySalary = monthlySalary;
    }

    /**
     *  getter for monthlySalary.
     *  @return The monthly salary of the employee.
     */
    public double getMonthlySalary() {
        return monthlySalary;
    }

    /**
     *  setter for monthlySalary.
     *  @param monthlySalary The new monthly salary of the employee.
     */
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
    
    @Override
    public String getnI() {
    	return super.getnI();
    }
    

    /**
     *  The toString() method to display MonthlyEmployee objects. In
     *  addition to the details of an Employee, the monthly salary is
     *  displayed.  Note that the "@Override" statement is
     *  optional. However, it is good practice to write it; in this
     *  case the compiler checks whether the method actually overrides
     *  some other, if not en error will occur.
     *  @return A human readable string of a MonthlyEmployee object.
     */
    @Override
    public String toString() {
        return String.format("%s\n Monthly salary: %,.2f\n",
                super.toString(), 
                getMonthlySalary());
    }
    @Override
    public void increaseSalary(double rate){
        setMonthlySalary(getMonthlySalary() * rate + getMonthlySalary());
    }
         
    /**
     *   An implementation of the getPaymentAmount() method
     *   @return A monthly paid employee has to receive their monthly
     *   salary, which is returned as the payment amount.
     */
    @Override
    public double paymentAmount(){
        return getMonthlySalary();
    }
    
}

