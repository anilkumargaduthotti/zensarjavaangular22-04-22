package Basics;

import java.time.LocalDate;
import java.util.Scanner;

public class employee {
    String eName;
    String eRole;
    double eSalary;
    String dob;
    double exp;
    
    @Override
    public String toString() {
        return "employee [eName = " +eName+ ", eRole = " +eRole+ ",eSalary = "+ eSalary +", dob = "+eSalary+ ", exp = "+ exp +"]";
    }

    public String geteName() {
        return eName;
    }
    public void seteName(String eName) {
        this.eName = eName;
    }
    public String geteRole() {
        return eRole;
    }
    public void seteRole(String eRole) {
        this.eRole = eRole;
    }
    public double geteSalary() {
        return eSalary;
    }
    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public double getExp() {
        return exp;
    }
    public void setExp(double exp) {
        this.exp = exp;
    }
    
    public employee(String ename, String erole, double esalary, String dob, double exp){
        eName = ename;
        eRole = erole;
        eSalary = esalary;
        this.dob = dob;
        this.exp = exp;
    }
}
class employeeSystem{
    static Scanner sc = new Scanner(System.in);
    private static employee addEmployee() {
        System.out.println("Enter the employee Name : ");
        Scanner sc1 = new Scanner(System.in);
        String eName = sc1.nextLine();
        System.out.println("Enter the Employee Role : ");
        Scanner sc2 = new Scanner(System.in);
        String eRole = sc2.nextLine();
        System.out.println("Enter the employee Salary : ");
        Scanner sc3 = new  Scanner(System.in);
        double eSalary = sc3.nextDouble();
        
        System.out.println("Enter the Employee DOB (dd/mm/yy) : ");
        Scanner docsc = new Scanner(System.in);
        String dob = docsc.nextLine();
        String d = dob.split("/")[0];
        String m = dob.split("/")[1];
        String y = dob.split("/")[2];

        System.out.println(LocalDate.of(Integer.parseInt(y), Integer.parseInt(m), Integer.parseInt(d)));
        
        System.out.println("Enter the employee Experience :");
        Scanner sc5 = new Scanner(System.in);
         double exp = sc5.nextDouble();

         employee e = new employee (eName, eRole , eSalary , dob , exp);
         System.out.println(" Employee added Successfully");
         System.out.println(e);
         return e;
    }
    public static void main(String[] args) {

        while (true) {
            System.out.println("1. Add an employee");
            System.out.println("2. Exit the program");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                addEmployee();
                break;
                case 2:
                System.out.println("Thankyou for using our employee System.");
                System.exit(0);
                break;
                default:
                break;
            }
        }
    }
}