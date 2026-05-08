package labjava_1;


public abstract class Employee {
    protected String name;
    protected Date hiredDate;

    public Employee(String name, Date hiredDate) {
        this.name = name;
        this.hiredDate = hiredDate;
    }

    public String toString(){
        return name+", "+hiredDate.toString()+", ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean sameName(Employee other){
        return getName().equals(other.getName());
    }
    public int workYear(int toYear){
        return toYear-hiredDate.getYear();
    }
    public abstract double monthlySalary();

    public Date getHiredDate() {
        return hiredDate;
    }
}
