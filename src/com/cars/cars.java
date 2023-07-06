package com.cars;

import com.employee.employee;
import com.showroom.showroom;
import com.showroom.utility;

import java.util.ArrayList;
import java.util.Scanner;

public class cars extends showroom implements utility {
    String car_name;
    String car_color;
    int car_model;
    String car_type;

    public cars() {
    }

    public cars(String car_name,String car_color, int car_model, String car_type) {
        this.car_name=car_name;
        this.car_color = car_color;
        this.car_model = car_model;
        this.car_type = car_type;
    }

    Scanner sc=new Scanner(System.in);
    ArrayList <cars> cars=new ArrayList<>();
    cars obj=null;

    @Override
    public void set_details() {
        System.out.println("car name:");
        car_name=sc.next();
        System.out.println("Car color:");
        car_color= sc.next();
        System.out.println("car model:");
        car_model=sc.nextInt();
        System.out.println("car type (manual/automatic)");
        car_type=sc.next();
        car_stock=car_stock+1;

        obj=new cars(car_name, car_color, car_model, car_type);
        cars.add(obj);
        System.out.println("CAR HAS BEEN ADDED");

        int choice=0;
        boolean flag=true;

        while (flag){
            System.out.println("enter choice");
            System.out.println("1. ADD EMPLOYEE");
            System.out.println("9. GO BACK");
            choice=sc.nextInt();

            switch (choice){
                case (1):
                    cars obj1=null;
                    System.out.println("===========ENTER DETAILS===========");
                    System.out.println("car name:");
                    car_name=sc.next();
                    System.out.println("Car color:");
                    car_color= sc.next();
                    System.out.println("car model:");
                    car_model=sc.nextInt();
                    System.out.println("car type (manual/automatic)");
                    car_type=sc.next();
                    car_stock=car_stock+1;

                    obj1=new cars(car_name, car_color, car_model, car_type);
                    cars.add(obj1);
                    System.out.println("CAR HAS BEEN ADDED");
                    break;

                case (9):
                    flag=false;
            }



        }

    }

    @Override
    public void get_details() {
        int i=1;
        for (cars cars:cars) {
            System.out.println(i+ " car name: " + cars.car_name +
                                  ",  car color: "+ cars.car_color +
                                  ",  car model: "+ cars.car_model +
                                  ",  car type: "+ cars.car_type +
                                  ",  cars in stock: "+ car_stock +
                                  i++
                    );
        }
    }
}
