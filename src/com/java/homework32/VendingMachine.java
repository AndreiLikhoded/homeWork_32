package com.java.homework32;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class VendingMachine {

    private int loadCapacity = 50;
    public List<Goods> goods;

    public VendingMachine() {
        goods = new ArrayList<>();
    }

    static Scanner scanner = new Scanner(System.in);

    public void randomLoad() {
        Random random = new Random();
        var g = Goods.values();
        while (loadCapacity > 0 && loadCapacity <= 50) {
            int r = random.nextInt(5);

            goods.add(g[r]);

            if (loadCapacity - g[r].getGoodCapacity() < 0) {
                loadCapacity = 0;
            } else
                loadCapacity -= g[r].getGoodCapacity();
        }

//        System.out.println("--------Menu--------");
//        System.out.printf("A  [70] %s%n B   [30] %s%n C   [40] %s%n D   [20] %s%n E   [20] %s%n",  Goods.BANANZACHIPS, Goods.CANDY, Goods.BOUNTY, Goods.CRACKERS, Goods.WATER);
    }

    public void purchase(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the money:-> ");
        double money = scanner.nextDouble();
        var g = Goods.values();
        if(money == 20) {
            System.out.printf("[20] %s%n [20] %s%n", Goods.WATER, Goods.CRACKERS);
        } else if (money == 30) {
            System.out.printf("[30] %s%n", Goods.CANDY);
        } else if (money == 40) {
            System.out.printf("[40] %s%n", Goods.BOUNTY);
        } else if (money == 70) {
            System.out.printf("[70] %s%n", Goods.BANANZACHIPS);
        } else {
            System.out.println("Your money is not enough for purchase, insert one more");
        }
    }

//    public void printGoods() {
//        double price = -1;
//        System.out.println("--------Menu--------");
//        System.out.printf("A  [70] %s%n B   [30] %s%n C   [15] %s%n D   [50] %s%n E   [40] %s%n F   [20] %s%n", Goods.BANANZACHIPS, Goods.CANDY, Goods.BOUNTY, Goods.CRACKERS, Goods.WATER);
//      }

//    public void change(double money, double priceGoods){
//        if(money > priceGoods){
//            double change = money - priceGoods;
//            System.out.println("Here is your change " + change);
//        } else {
//            System.out.println("0");
//        }
//    }

//    double priceGoods = displayGoods();
}
