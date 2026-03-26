/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bài.pkg3.pkg11;

import java.util.*;
import java.util.stream.Collectors;

public class Bài311 {
    
    static class Employee {
        private int id;
        private String name;
        private double salary;
        
        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }
        
        public String getName() {
            return name;
        }
        
        public double getSalary() {
            return salary;
        }
        
        @Override
        public String toString() {
            return String.format("Employee{id=%d, tên='%s', lương=%.2f}", id, name, salary);
        }
    }
    
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Linh", 1200.00),
            new Employee(2, "Tuấn", 800.00),
            new Employee(3, "Anh", 1500.00),
            new Employee(4, "H", 950.00)
        );
        
        System.out.println("Tất cả nhân viên:");
        employees.forEach(System.out::println);
        
        List<String> highSalaryNames = employees.stream()
            .filter(emp -> emp.getSalary() > 1000)  
            .map(Employee::getName)              
            .sorted()                               
            .collect(Collectors.toList());          
        
        System.out.println("\nNhân viên có lương > 1000:");
        highSalaryNames.forEach(name -> System.out.println("- " + name));
        
        System.out.println("\nChi tiết các nhân viên có lương > 1000:");
        employees.stream()
            .filter(emp -> emp.getSalary() > 1000)
            .sorted(Comparator.comparing(Employee::getName))
            .forEach(System.out::println);
    }
}
