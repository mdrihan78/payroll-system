package payrollsystem;

public class SalariedEmployee extends Employee{

    private double salary;
    SalariedEmployee(String fname,String lname, int ssn,double salary){
        super(fname,lname,ssn);
        if(salary>-1){
        this.salary=salary;
        }
        else{
            System.out.println("Invalid input");
        }
    }
    public double earnings(){
        return salary;
    }
    public void setsalary(double salary){
        if(salary>-1){
            this.salary=salary;
        }
        else{
            System.out.println("Invalid input");
        }
    }
    public String toString(){
        return super.toString()+"\nsalary:"+salary;
    }
}
