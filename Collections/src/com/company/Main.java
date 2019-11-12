package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Employee> employeeList = new ArrayList<>();
        EmployeeUtil eu = new EmployeeUtil();
        employeeList.add(eu.employee1);
        employeeList.add(eu.employee2);
        employeeList.add(eu.employee3);
        employeeList.add(eu.employee4);
        employeeList.add(eu.employee5);

//        System.out.println("Show all employees:");
//        System.out.println(employeeList);
//
//        System.out.println("Get employee: " + employeeList.get(3));
//
//        employeeList.remove(3);
//        System.out.println(employeeList);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Enter name:");
        String name = reader.readLine();

        System.out.println("Enter age:");
        String ageSt = reader.readLine();
        int ageInt = Integer.parseInt(ageSt);

        System.out.println("Enter workplace:");
        String workPlaceSt = reader.readLine();
        int workPlaceInt = Integer.parseInt(workPlaceSt);

        employeeList.add(new Employee(name, ageInt, workPlaceInt));
        if (workPlaceInt < 1001){
            System.out.println("Not this floor!");
            int x = employeeList.size();
            for (int i = 0; i < x; i++) {
                if (employeeList.get(i).equals(employeeList.get(x-1))){
                employeeList.remove(i);
                }
            }
        }
        for (Object e : employeeList){
            System.out.println(e);
        }


    }
}
