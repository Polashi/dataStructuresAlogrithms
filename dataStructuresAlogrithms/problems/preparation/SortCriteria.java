package com.problems.preparation;

import java.util.Arrays;
import java.util.Comparator;

public class SortCriteria {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rohit", "Sharma", 39, 250);
        Employee e2 = new Employee("Virat", "Kohli", 38, 300);
        Employee e3 = new Employee("Hardik", "Pandya", 31, 200);
        Employee e4 = new Employee("Hardik", "Yadav", 39, 80);
        Employee e5 = new Employee("Irfan", "Pathan", 39, 150);
        Employee e6 = new Employee("Mahendra", "Dhoni", 39, 190);
        Employee e7 = new Employee("Sachin", "Tendulkar", 39, 210);
        Employee[] employees = {e1,e2,e3,e4,e5,e6,e7};

        Arrays.sort(employees, new Comparator<Employee>(){
            @Override
            public int compare(Employee e1, Employee e2){
                if(!e1.firstName.equals(e2.firstName)){
                    return e1.firstName.compareTo(e2.firstName);
                }else if(!e1.lastName.equals(e2.lastName)){
                    return e1.lastName.compareTo(e2.lastName);
                }else if(e1.age != e2.age){
                    return e1.age - e2.age;
                }else{
                    return e1.salary - e2.salary;
                }
            }
        });
    }





}
