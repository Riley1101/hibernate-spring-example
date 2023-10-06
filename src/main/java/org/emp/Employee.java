package org.emp;
public class Employee
{
    private int id;
    private String name;
    private float salary;

    public Employee() {
    }

    public Employee(int empno, String ename, float sal) {
        this.id = empno;
        this.name = ename;
        this.salary = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [" + id + " | " + name + " | " + salary + "]";
    }
}

