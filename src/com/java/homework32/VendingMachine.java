package com.java.homework32;

import java.util.Scanner;

public class VendingMachine {
    static Scanner scanner = new Scanner(System.in);


    public static double displayGoods(){
        System.out.println("---------MENU---------");

        double money = scanner.nextDouble();

        System.out.println("You have " + money);

        double price = 0;
        System.out.println("A.     70      Bananzachips");
        System.out.println("B.     30      Candy");
        System.out.println("C.     20     Water");
        System.out.println("D.     40      Bounty");
        System.out.println("E.     20      Crackers");
        System.out.println("What would you like?:");
        String choice = scanner.next().toUpperCase();



        if(choice.equals("A")){
            price = 70;
            return 70;
        } else if (choice.equals("B")) {
            price = 30;
            return 30;
        } else if (choice.equals("C")) {
            price = 20;
            return 20;
        } else if (choice.equals("D")) {
            price = 40;
            return 40;
        } else if (choice.equals("E")) {
            price = 20;
            return 20;
        } else {
            return price;
        }
    }

    public static void change(double money, double priceGoods){

    }

    double priceGoods = displayGoods();
}
