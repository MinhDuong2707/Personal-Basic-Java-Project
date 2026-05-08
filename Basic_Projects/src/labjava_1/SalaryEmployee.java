package labjava_1;

public class SalaryEmployee extends Employee{
    private double annualSalary;
    private double stockOption;

    public SalaryEmployee(String name, Date hiredDate, double annualSalary, double stockOption) {
        super(name, hiredDate);
        this.annualSalary = annualSalary;
        this.stockOption = stockOption;
    }

    @Override
    public String toString() {
        return super.toString()+annualSalary+", "+stockOption;
    }

    @Override
    public double monthlySalary() {
        double phuCap=(super.workYear(2008)>5)?5000000:0;
        return (annualSalary/12)+phuCap;
    }
}
