import java.util.Locale;
import java.util.Scanner;
import java.util.TreeMap;

public class GymOOP {
    public  static void main(String[] args)
    {
       System.out.println("Welcome to employee payroll system");
       TreeMap<Integer,Employee> employees = new TreeMap<>();
       String more= "yes";

       while(more.equalsIgnoreCase("yes")) {
           Scanner myScanner = new Scanner(System.in);
           System.out.println("Employee first name");
           String fname =myScanner.next();

           System.out.println("Employee last  name");
           String lname =myScanner.next();

           System.out.println("Employee hourly salary");
           Integer salary =myScanner.nextInt();

           Employee emp = new Employee(fname,lname,salary,0);
           employees.put(salary,emp);
           emp=null;

           System.out.println("Add more employees(yes/no");
            more =myScanner.next();
       }

       Payroll myPayroll = new Payroll(employees);
       myPayroll.CalculateTotalSalariesAndTaxRate(employees);



    }


}
