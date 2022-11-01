public class Employee {
    String fname;
    String lName;
    Integer salary;

    public Employee(String fname, String lName, Integer salary, Integer noOfWeeks) {
        this.fname = fname;
        this.lName = lName;
        this.salary = salary;

    }

    public Integer getSalary() {
        return salary;
    }

    public String getFname() {
        return fname;
    }

    public String getlName() {
        return lName;
    }
}
