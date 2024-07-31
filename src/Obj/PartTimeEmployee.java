package Obj;

public class PartTimeEmployee extends Employee {
    private Float hoursWorked;
    private Float hourlyRate;

    public PartTimeEmployee(String name, Integer id, Float hoursWorked, Float hourlyRate) {
        super(name,id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public Float getHoursWorked() {
        return hoursWorked;
    }

    public Float getHourlyRate() {
        return hourlyRate;
    }

    public void setHoursWorked(Float hoursWorked) {
        this.hoursWorked=hoursWorked;
    }

    public void setHourlyRate(Float hourlyRate) {
        this.hourlyRate=hourlyRate;
    }

    public void calculateSalary() {
        Float fullsalary = getHoursWorked() * getHourlyRate();
        System.out.println("5.Full Salary of employee: " + fullsalary);
    }
}
