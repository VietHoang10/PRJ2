package Obj;

public class FullTimeEmployee extends Employee {
    private Float bonus;

    public FullTimeEmployee(String name, Integer id, Float salary, Float bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public Float getBonus() {
        return bonus;
    }

    public void setBonus(Float bonus) {
        this.bonus=bonus;
    }

    public void calculateSalary() {
        Float fullsalary = getSalary() + getBonus();
        System.out.println("5.Full Salary of employee: " + fullsalary);

    }
}
