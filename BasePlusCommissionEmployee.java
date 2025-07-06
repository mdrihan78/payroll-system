

public class BasePlusCommissionEmployee extends CommissionEmployee{
      private double basesalary;
      BasePlusCommissionEmployee(String fname,String lname,int ssn,double sales,double percentage,double basesalary){
        super(fname,lname,ssn,sales,percentage);
        if(basesalary>-1)
        this.basesalary=basesalary;
      }
      public double getbasesalary(){
        return this.basesalary;
      }
      public void setbasesalary(double basesalary){
        this.basesalary=basesalary;
      }
    
      public double earnings(){
        return (basesalary+super.earnings()); 
    }
    public String toString(){
        return super.toString()+"\nsalary :"+(basesalary+super.earnings());
    }
}
