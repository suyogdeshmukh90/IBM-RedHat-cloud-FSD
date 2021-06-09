package employee;

import java.util.Date;

public class Engineer extends Employee{
    private String branch;

    public Engineer() {
        super();
    }

    public Engineer(String empName, double empSalary, String birthDate, String branch) {
        super(empName, empSalary, birthDate);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+"Branch: "+getBranch();
    }
}
