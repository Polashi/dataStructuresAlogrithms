package com.problems.preparation;

public class Employee {
    String firstName;
    String lastName;
    int age;
    int salary;

    public Employee(String firsName,String lastName, int age, int salary){
        this.firstName = firsName;
        this.lastName = lastName;
        this.age= age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
