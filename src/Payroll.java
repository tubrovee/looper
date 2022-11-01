import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Payroll {
    TreeMap<Integer,Employee> EmployeeList;
    Employee emp;
    Integer taxRate=20;

    public Payroll(TreeMap<Integer, Employee> employeeList) {
        EmployeeList = employeeList;
    }

    public Integer calculateEmployeeTax(Employee emp)
    {
        return 0;
    }

    public  void CalculateTotalSalariesAndTaxRate(TreeMap<Integer,Employee> employeeList)
    {
        for(Map.Entry<Integer,Employee> entry : employeeList.entrySet()) {

            Employee value = entry.getValue();

            System.out.println(value.lName + ","
                        + value.fname + "         \n Salary= " + value.salary
                        + " weekly Salary="
                        + 40 * value.salary + "$"
                        + " Tax=" + (40*value.salary) *.2 +"$");

        }

    }

}
