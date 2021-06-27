package pl.futurecollars.lesson5.task4;

import java.math.BigDecimal;

public class Employee {

    private final String name;
    private final String surname;
    private int age;
    private BigDecimal baseSalary;
    private BigDecimal bonus;
    private final String WHITE_SPACE = " ";


    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Employee(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;
    }

    public Employee(String name, String surname, int age, BigDecimal baseSalary, BigDecimal bonus) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    protected String getEmployeeInfo() {
        return "Employee name : " + name + WHITE_SPACE + surname;
    }

    protected String getEmployeeDetails() {
        return "Employee details : " + name + WHITE_SPACE + surname + " is " + age;
    }

    protected BigDecimal getTotalSalary() {
        return baseSalary.add(bonus);
    }

    protected BigDecimal getBaseSalary() {
        return baseSalary;
    }

    protected BigDecimal getBonus() {
        return bonus;
    }
}
