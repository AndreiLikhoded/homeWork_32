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
        vendingMachine.print();


    }

}
