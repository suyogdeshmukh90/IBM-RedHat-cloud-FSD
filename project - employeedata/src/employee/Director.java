package employee;

import java.util.Date;

public class Director extends Manager{
    private double carAllowance;

    public Director() {
        super();
    }

    public Director(String empName, double empSalary, String birthDate, String department, double carAllowance) {
        super(empName, empSalary, birthDate, department);
        this.carAllowance = carAllowance;
    }


    public double getCarAllowance() {
        return carAllowance;
    }

    public void setCarAllowance(double carAllowance) {
        this.carAllowance = carAllowance;
    }
    public double increaseAllowance()
    {

        if(super.getDepartment()=="IT")
        {
            return (carAllowance*10)/100;
        }
        else{
            return (carAllowance*7)/100;
        }
    }

    @Override
    public String getDetails() {
        return super.getDetails()+ " Car Allowance: "+ getCarAllowance()+" Increase Allowance: "+increaseAllowance();
    }
}
