

public class CommissionEmployee extends Employee{
     private double sales;
     private double percentage;
     protected double commission;
     CommissionEmployee(String fname,String lname,int ssn,double sales,double percentage){
        super(fname,lname,ssn);
        if(sales>-1 && percentage >-1){
        this.sales=sales;
        this.percentage=percentage;
        }
     }
     public double earnings(){
        return sales*percentage;
    }
    public String toString(){
        return super.toString()+"\ncommission:"+sales*percentage;
    }
}
