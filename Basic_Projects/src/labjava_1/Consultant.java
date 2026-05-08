package labjava_1;

public class Consultant extends Employee {
    private String contractNumber;
    private double billingRate;

    public Consultant(String name, Date hiredDate, String contractNumber, double billingRate) {
        super(name, hiredDate);
        this.contractNumber = contractNumber;
        this.billingRate = billingRate;
    }

    @Override
    public String toString() {
        return super.toString()+contractNumber+", "+billingRate;
    }

    @Override
    public double monthlySalary() {
        return billingRate;
    }
}
