package com.java.homework32;

public enum Goods {
    BANANZACHIPS(70, 1),
    CANDY(30, 1),
    WATER(20, 1),
    BOUNTY(40, 1),
    CRACKERS(20, 1);

    private double price;
    private int goodCapacity;

    Goods(double price, int goodCapacity){
        this.price = price;
        this.goodCapacity = goodCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getGoodCapacity() {
        return goodCapacity;
    }

    public void setGoodCapacity(int goodCapacity) {
        this.goodCapacity = goodCapacity;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                ", goodCapacity=" + goodCapacity +
                '}';
    }
}
