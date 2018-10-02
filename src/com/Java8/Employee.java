package com.Java8;

import java.io.Serializable;

class Employee implements Serializable {
    private String name;
    private double salary;
    private String competancy;

    public Employee(String name, double salary, String competancy) {
        this.name = name;
        this.salary = salary;
        this.competancy = competancy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompetancy() {
        return competancy;
    }

    public void setCompetancy(String competancy) {
        this.competancy = competancy;
    }
}
