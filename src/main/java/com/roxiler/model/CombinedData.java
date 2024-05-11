package com.roxiler.model;

import java.util.List;
import java.util.Map;

public class CombinedData {
    private List<Transaction> transactions;
    private Statistics statistics;
    private List<PriceRange> priceRanges;
    private Map<String, Integer> pieChartData;

    // Constructor, getters, and setters


    public CombinedData(List<Transaction> transactions, Statistics statistics, List<PriceRange> priceRanges, Map<String, Integer> pieChartData) {
        this.transactions = transactions;
        this.statistics = statistics;
        this.priceRanges = priceRanges;
        this.pieChartData = pieChartData;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public List<PriceRange> getPriceRanges() {
        return priceRanges;
    }

    public void setPriceRanges(List<PriceRange> priceRanges) {
        this.priceRanges = priceRanges;
    }

    public Map<String, Integer> getPieChartData() {
        return pieChartData;
    }

    public void setPieChartData(Map<String, Integer> pieChartData) {
        this.pieChartData = pieChartData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Combined Data: {\n");
        sb.append("  Transactions: ").append(transactions).append("\n");
        sb.append("  Statistics: ").append(statistics).append("\n");
        sb.append("  Price Ranges: ").append(priceRanges).append("\n");
        sb.append("  Pie Chart Data: ").append(pieChartData).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
