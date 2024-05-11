package com.roxiler.model;
public class PriceRange {
    private int minPrice;
    private int maxPrice;
    private int numberOfItems;

    // Constructor, getters, and setters

    public int getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(int maxPrice) {
        this.maxPrice = maxPrice;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public PriceRange(int minPrice, int maxPrice, int numberOfItems) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
        this.numberOfItems = numberOfItems;
    }

    public PriceRange() {
    }

    @Override
    public String toString() {
        return "PriceRange{" +
                "minPrice=" + minPrice +
                ", maxPrice=" + maxPrice +
                ", numberOfItems=" + numberOfItems +
                '}';
    }
}