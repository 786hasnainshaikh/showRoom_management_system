package com.showroom;


import java.util.ArrayList;
import java.util.Scanner;

public class showroom implements utility{
   public String sh_name;
    public String sh_address;
    public int total_emp = 10;
    public int car_stock=1;
    String manager_name;

    public showroom() {

    };

    public showroom(String sh_name, String sh_address, int total_emp, int car_stock, String manager_name) {
        this.sh_name = sh_name;
        this.sh_address = sh_address;
        this.total_emp = total_emp;
        this.car_stock = car_stock;
        this.manager_name = manager_name;
    }



    Scanner sc = new Scanner(System.in);

    public ArrayList<showroom> list = new ArrayList<>();

    showroom obj = null;
    @Override
    public void set_details() {

        System.out.println("===========ENTER DETAILS===========");
        System.out.println("SHOWROOM NAME:");
        sh_name = sc.next();

        System.out.println("SHOWROOM ADDRESS");
        sh_address = sc.next();


        System.out.println("MANGER NAME");
        manager_name = sc.next();
        obj = new showroom(sh_name, sh_address, total_emp, car_stock, manager_name);

        list.add(obj);
        System.out.println("SHOW ADDED SUCCESSFULLY!!!");

        int choice=0;
        boolean flag=true;
        while (flag) {
            System.out.println("enter choice");
            System.out.println("1. ADD SHOWROOM");
            System.out.println("9. GO BACK");
            choice=sc.nextInt();


            switch (choice){
                case (1):
                    showroom obj1=null;
                    System.out.println("===========ENTER DETAILS===========");
                    System.out.println("SHOWROOM NAME:");
                    sh_name = sc.next();

                    System.out.println("SHOWROOM ADDRESS");
                    sh_address = sc.next();


                    System.out.println("MANGER NAME");
                    manager_name = sc.next();
                    obj1 = new showroom(sh_name, sh_address, total_emp, car_stock, manager_name);

                    list.add(obj1);
                    System.out.println("SHOW ADDED SUCCESSFULLY!!!");

                    break;


                case (9):
                    flag=false;
        }


        }
    }

    @Override
    public void get_details() {
        for (showroom showroom : list) {
            System.out.println("SHOWROOM:" + showroom.sh_name
                    + ", SHOWROOM ADDRESS" + showroom.sh_address
                    + ", TOTAL EMPLOYEE: " + showroom.total_emp
                    + ", CAR IN STOCK: " + showroom.car_stock
                    + ", MANAGER NAME: " + showroom.manager_name);
        }
    }
}
