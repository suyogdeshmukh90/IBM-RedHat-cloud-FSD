package employee;

import java.util.Date;

public class Manager extends Employee{
    private String department;

    public Manager() {
        super();
    }

    public Manager(String empName, double empSalary, String birthDate, String department) {
        super(empName, empSalary, birthDate);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+" Department: "+getDepartment();
    }
}
