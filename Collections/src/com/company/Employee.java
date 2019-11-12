package com.company;
import java.util.Objects;

public class Employee {
    private String name;
    private int age;
    private int workPlace;

    public Employee() {
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Employee(String name, int age, int workPlace){
        this.name = name;
        this.age = age;
        this.workPlace = workPlace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(int workPlace) {
        this.workPlace = workPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getAge() == employee.getAge() &&
                getWorkPlace() == employee.getWorkPlace() &&
                Objects.equals(getName(), employee.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getWorkPlace());
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", workPlace=" + workPlace + '}';
    }
}
