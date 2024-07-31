package Obj;

public abstract class Employee {
    private String name;
    private Integer id;
    private Float salary;

    public Employee(String name, Integer id, Float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employee(String name, Integer id) {
        this.name=name;
        this.id=id;
    }

    abstract void calculateSalary();

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Float getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setId(Integer id) {
        this.id=id;
    }

    public void setSalary(Float salary) {
        this.salary=salary;
    }

}
