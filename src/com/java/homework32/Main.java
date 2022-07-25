package com.java.homework32;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        run();
    }
    public static void run(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.randomLoad();
        vendingMachine.purchase();



    }
    public static double print(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please insert the money:-> ");
        double money = scanner.nextDouble();

        System.out.print("Choose the goods, please ");
        String choice = scanner.next().toUpperCase();

        double price = -1;
        if(choice.equals("A")){
            return 70.0;
        } else if (choice.equals("B")) {
            return 30.0;
        } else if (choice.equals("C")) {
            return 15.0;
        } else if(choice.equals("D")){
            return 50.0;
        } else if(choice.equals("E")){
            return 40.0;
        } else if(choice.equals("F")){
            return 20.0;
        } else {
            return price;
        }
    }
}
