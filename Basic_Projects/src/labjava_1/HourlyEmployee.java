package labjava_1;

public class HourlyEmployee extends Employee{
    private double hourlyRate;
    private double primaryHours;

    public HourlyEmployee(String name, Date hiredDate, double hourlyRate, double primaryHours) {
        super(name, hiredDate);
        this.hourlyRate = hourlyRate;
        this.primaryHours = primaryHours;
    }

    @Override
    public String toString() {
        return super.toString()+hourlyRate+", "+primaryHours;
    }

    @Override
    public double monthlySalary() {
        return hourlyRate*primaryHours;
    }
}
