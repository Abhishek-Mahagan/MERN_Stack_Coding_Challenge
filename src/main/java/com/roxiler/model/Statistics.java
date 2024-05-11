package com.roxiler.model;

public class Statistics {
    private double totalSaleAmount;
    private int totalSoldItems;
    private int totalNotSoldItems;

    // Constructor, getters, and setters

    public double getTotalSaleAmount() {
        return totalSaleAmount;
    }

    public void setTotalSaleAmount(double totalSaleAmount) {
        this.totalSaleAmount = totalSaleAmount;
    }

    public int getTotalSoldItems() {
        return totalSoldItems;
    }

    public void setTotalSoldItems(int totalSoldItems) {
        this.totalSoldItems = totalSoldItems;
    }

    public int getTotalNotSoldItems() {
        return totalNotSoldItems;
    }

    public void setTotalNotSoldItems(int totalNotSoldItems) {
        this.totalNotSoldItems = totalNotSoldItems;
    }

    public Statistics(double totalSaleAmount, int totalSoldItems, int totalNotSoldItems) {
        this.totalSaleAmount = totalSaleAmount;
        this.totalSoldItems = totalSoldItems;
        this.totalNotSoldItems = totalNotSoldItems;
    }

    public Statistics() {
    }

    @Override
    public String toString() {
        return "Statistics{" +
                "totalSaleAmount=" + totalSaleAmount +
                ", totalSoldItems=" + totalSoldItems +
                ", totalNotSoldItems=" + totalNotSoldItems +
                '}';
    }
}