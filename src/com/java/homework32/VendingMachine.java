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

        System.out.println("--------Menu--------");
        System.out.printf(" A-   [70] %s%n B-   [30] %s%n C-   [40] %s%n D-   [20] %s%n E-   [20] %s%n", Goods.BANANZACHIPS, Goods.CANDY, Goods.BOUNTY, Goods.CRACKERS, Goods.WATER);

    }

    public double print() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the goods, please: ");
        String choice = scanner.next().toUpperCase();
        double price = -1;

        if(choice.equals("A")){
            System.out.println("You choose water");
            return 20.0;
        } else if (choice.equals("B")) {
            System.out.println("You choose crackers");
            return 20.0;
        } else if (choice.equals("C")) {
            System.out.println("You choose candy");
            return 30.0;
        } else if(choice.equals("D")){
            System.out.println("You choose bounty");
            return 40.0;
        } else if(choice.equals("E")){
            System.out.println("You choose bananzachips");
            return 70.0;
        } else {
            return price;
        }
    }

    public void purchase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert the money:-> ");
        double money = scanner.nextDouble();
        while (true) {
            if (money == 20) {
                System.out.println("You can choose: 'A' [20] - Water\n 'B' [20] - Crackers");
                break;
            } else if (money == 30) {
                System.out.println("You can choose: 'A' [20] - Water\n 'B' [20] - Crackers\n 'C' [30] - Candy");
                break;
            } else if (money == 40) {
                System.out.println("You can choose: 'A' [20] - Water\n 'B' [20] - Crackers\n 'C' [30] - Candy\n 'D' [40] - Bounty");
                break;
            } else if (money == 70) {
                System.out.println("You can choose: 'A' [20] - Water\n 'B' [20] - Crackers\n 'C' [30] - Candy\n 'D' [40] - Bounty\n 'E' [70] - Bananzachips");
                break;
            } else {
                System.out.println("Your input is not correct, take a look at the price of products, and insert correct sum: ");
                double money2 = scanner.nextDouble();
            }
            double price = print();
            if (money > price) {
                double change = money - price;
                System.out.println("Your change is " + change);
            } else {
                System.out.println("0");
            }
        }
    }
}
