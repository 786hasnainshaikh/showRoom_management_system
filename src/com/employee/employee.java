package com.employee;

import com.showroom.showroom;
import com.showroom.utility;

import java.util.ArrayList;
import java.util.Scanner;

public class employee extends showroom implements utility {

    int employee_id;
    String employee_name;
    int employee_age;
    String emp_depart;
    int total_employee=0;

    public employee() {
    }

    public employee(
            int employee_id, String employee_name, int employee_age, String emp_depart) {

        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.employee_age = employee_age;
        this.emp_depart = emp_depart;
    }

    Scanner sc = new Scanner(System.in);
    ArrayList<employee> employeeList = new ArrayList<>();

    employee employee = null;


    @Override
    public void set_details() {
        System.out.println("===========ENTER DETAILS===========");
        System.out.println("enter employee ID:");
        employee_id = sc.nextInt();
        System.out.println("employee name:");
        employee_name = sc.next();
        System.out.println("employee age");
        employee_age = sc.nextInt();
        System.out.println("employee department");
        emp_depart = sc.next();
        System.out.println("showroom name: ");
        sh_name = sc.next();
        total_employee+=1;

        employee = new employee(employee_id, employee_name, employee_age,
                emp_depart);
        employeeList.add(employee);
        System.out.println("employee has been added");


        int choice=0;
        boolean flag=true;

        while (flag){
            System.out.println("enter choice");
            System.out.println("1. ADD EMPLOYEE");
            System.out.println("9. GO BACK");
            choice=sc.nextInt();

            switch (choice){
                case (1):
                    employee obj1=null;
                    System.out.println("===========ENTER DETAILS===========");
                    System.out.println("enter employee ID:");
                    employee_id = sc.nextInt();
                    System.out.println("employee name:");
                    employee_name = sc.next();
                    System.out.println("employee age");
                    employee_age = sc.nextInt();
                    System.out.println("employee department");
                    emp_depart = sc.next();
                    System.out.println("showroom name: ");
                    sh_name = sc.next();
                    total_employee+=1;

                    obj1 = new employee(employee_id, employee_name, employee_age,
                            emp_depart);
                    employeeList.add(obj1);
                    System.out.println("employee has been added");
                    break;

                case (9):
                    flag=false;
            }



        }
    }



    @Override
    public void get_details() {
        for (employee element : employeeList) {
            System.out.println("Employee ID: " + element.employee_id
                    + ", Employee name: " + element.employee_name +
                    ", Employee age: " + element.employee_age +
                    ", Employee department: " + element.emp_depart +
                    ", Showroom name" + sh_name+
                    ", Total Employee" + total_employee);

        }
    }

}
