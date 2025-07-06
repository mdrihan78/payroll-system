

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] employee = new Employee[100];
        int count = 0;
        while (true) {
            int choice = -1;
            System.out.println("1) Add Employee");
            System.out.println("2) Employee Infromation and salary");
            System.out.println("3) Increase base salary of all Base + Commission employee");
            System.out.println("4) Quit");
             System.out.print("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter first name :");
                    String fname;
                    fname = scan.nextLine();
                    System.out.print("Enter last name :");
                    String lname;
                    lname = scan.nextLine();
                    System.out.print("Enter ssn :");
                    int ssn;
                    ssn = scan.nextInt();
                    System.out.println("1) Salaried Employee");
                    System.out.println("2) Hourly Employee");
                    System.out.println("3) Commission Employee");
                    System.out.println("4) Basic plus Commission Employee");
                    System.out.print("Enter your choice: ");
                    choice = scan.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.print("Enter weekly salary:");
                            double salary;
                            salary = scan.nextDouble();
                            employee[count++] = new SalariedEmployee(fname, lname, ssn, salary);
                            System.out.println("Employee added successfully!");
                            break;
                        case 2:
                            int workhour;
                            double hourlywage;
                            System.out.print("Enter hours Worked:");
                            workhour = scan.nextInt();
                            System.out.print("Enter hourly wage:");
                            hourlywage = scan.nextDouble();
                            employee[count++] = new HourlyEmployee(fname, lname, ssn, workhour, hourlywage);
                            System.out.println("Employee added successfully!");
                            break;
                        case 3:
                            double sales;
                            System.out.print("Enter Sales:");
                            sales = scan.nextDouble();
                            double percentage;
                            System.out.print("Enter Percentage:");
                            percentage = scan.nextDouble();
                            employee[count++] = new CommissionEmployee(fname, lname, ssn, sales, percentage);
                            System.out.println("Employee added successfully!");
                            break;
                        case 4:
                            System.out.print("Enter Sales:");
                            sales = scan.nextDouble();
                            System.out.print("Enter Percentage:");
                            percentage = scan.nextDouble();
                            double basesalary;
                            System.out.print("Enter Salary:");
                            basesalary = scan.nextDouble();

                            employee[count++] = new BasePlusCommissionEmployee(fname, lname, ssn, sales, percentage,
                                    basesalary);
                            System.out.println("Employee added successfully!");
                            break;
                        default :
                        System.out.println("Invalid input");
                        break;
                    }
                    break;
                case 2:
                    for (int i = 0; i < count; i++) {
                        System.out.println(employee[i].toString());
                        breakings();
                    }
                    break;
                case 3:
                    for (int i = 0; i < count; i++) {
                        if (employee[i] instanceof BasePlusCommissionEmployee) {
                            BasePlusCommissionEmployee temp1 = (BasePlusCommissionEmployee) employee[i];
                            double temp = temp1.getbasesalary();
                            temp=temp+(temp*0.1);
                            temp1.setbasesalary(temp);
                        }
                    }
                     break;
                default:
                   System.exit(0);
                    break;
            }

        }
    }

    public static void breakings() {
        System.out.println("");
        for (int i = 0; i < 50; i++) {
            System.out.print("=");
        }
        System.out.println("");
    }
}
