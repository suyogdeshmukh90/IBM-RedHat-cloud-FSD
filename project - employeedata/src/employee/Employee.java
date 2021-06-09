package employee;



public class Employee {
    private String empName;
    private double empSalary;
    private String birthDate;

    public Employee() {
    }

    public Employee(String empName, double empSalary, String birthDate) {
        this.empName = empName;
        this.empSalary = empSalary;
        this.birthDate = birthDate;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getDetails()
    {
        return " Name: "+getEmpName()+" Salary: "+getEmpSalary()+" BirthDate"+getBirthDate();
    }
}
