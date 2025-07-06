


public abstract class Employee {
      private String fname;
     private String lname;
     private int ssn;
      
     
      Employee(String fname,String lname,int ssn){
      this.fname=fname;
      this.lname=lname;
      this.ssn=ssn;
      }
      public String getfname(){return fname;}
      public String getlname(){return lname;}
      public int getssn(){return ssn;}
       
     public void setfname(String fname) { this.fname = fname; }
    public void setlname(String lname) { this.lname = lname; }
    public void setssn(int ssn) {
        this.ssn = ssn;
    }
    public abstract double earnings();
      public String toString(){
        return "\nFirst name :"+fname + "\nLast name :" +lname+"\nSSN :"+ssn;
      }

      
}
