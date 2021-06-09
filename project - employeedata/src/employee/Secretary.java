package employee;

import java.util.Date;

public class Secretary extends Employee{
    private String reportees;
    public Secretary() {
        super();
    }

    public Secretary(String empName, double empSalary, String birthDate,String reportees) {
        super(empName, empSalary, birthDate);
        this.reportees=reportees;
    }

    public String getReportees() {
        return reportees;
    }

    public void setReportees(String reportees) {
        this.reportees = reportees;
    }

    @Override
    public String getDetails() {
        return super.getDetails()+" Reporting to: "+getReportees();
    }
}
