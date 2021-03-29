package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee("Mark", 2346, new Salary(23456));
        String currentDir = System.getProperty("user.dir");

        Methods.serialize(employee,currentDir+ "C:\\Users\\Admin\\IdeaProjects\\Hometask\\src\\com\\company\\employeeOUT");
        System.out.println(Methods.deserialize(currentDir+"C:\\Users\\Admin\\IdeaProjects\\Hometask\\src\\com\\company\\employeeOUT"));

        List<Employee> employees = new ArrayList<>(Arrays.asList(employee));
        employees.add(new Employee("Ira", 98056, new Salary(48759)));
        employees.add(new Employee("Nadya", 45986, new Salary(8987)));
        employees.add(new Employee("Oksana", 25036, new Salary(5959)));

        Methods.serialize(employees, currentDir+"C:\\Users\\Admin\\IdeaProjects\\Hometask\\src\\com\\company\\employeeOUT");
        List<Employee> employeesDeserialized = (List<Employee>) Methods.deserialize(currentDir+"C:\\Users\\Admin\\IdeaProjects\\Hometask\\src\\com\\company\\employeeOUT");

        System.out.println(employeesDeserialized);

        List<Salary> sala = new ArrayList<>();

        for (Employee e : employees){
            sala.add(e.getSalary());
        }

        Methods.serialize(sala, currentDir+"C:\\Users\\Admin\\IdeaProjects\\Hometask\\src\\com\\company\\salaryOUT");
        List<Salary> salariesDeserialized = (List<Salary>) Methods.deserialize(currentDir+"C:\\Users\\Admin\\IdeaProjects\\Hometask\\src\\com\\company\\salaryOUT");

        for (Employee e : employees){
            System.out.println(e.getName()+"'sala it "+ salariesDeserialized.get(employees.indexOf(e)).getSuma());
            sala.add(e.getSalary());
        }
    }
}
