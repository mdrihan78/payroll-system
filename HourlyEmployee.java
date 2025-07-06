package payrollsystem;

public class HourlyEmployee extends Employee {
    private double hourlywage;
    private int workhour;
    

    HourlyEmployee(String fname, String lname, int ssn, int workhour, double hourlywage) {
        super(fname, lname, ssn);
        if (workhour > -1 && hourlywage > -1) {
            this.workhour = workhour;
            this.hourlywage = hourlywage;

        } else {
            System.out.println("Invalid input");
        }
    }

    public double earnings() {
        if (workhour > 40) {
            return (1.5 * (workhour - 40) * hourlywage) + (40 * hourlywage);
        } else {
            return workhour * hourlywage;
        }
    }

    public String toString() {
        return super.toString() + "\nsalary:" + earnings();
    }
}
