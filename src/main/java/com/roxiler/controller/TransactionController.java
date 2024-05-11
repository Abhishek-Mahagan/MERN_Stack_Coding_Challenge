package com.roxiler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import com.roxiler.model.Transaction;
import com.roxiler.model.Statistics;
import com.roxiler.model.PriceRange;
import com.roxiler.model.CombinedData;
import com.roxiler.service.TransactionService;

@RestController
@RequestMapping("/api")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    // Initialize the database with seed data from the third party API
    @GetMapping("/initialize-database")
    public void initializeDatabase() {
        transactionService.initializeDatabase();
    }

    // API to list all transactions with search and pagination
    @GetMapping("/transactions")
    public List<Transaction> listTransactions(
            @RequestParam(required = false, defaultValue = "") String search,
            @RequestParam(required = false, defaultValue = "1") int page,
            @RequestParam(required = false, defaultValue = "10") int perPage,
            @RequestParam(required = false) String month
    ) {
        return transactionService.searchTransactions(search, page, perPage, month);
    }

    // API for statistics
    @GetMapping("/statistics")
    public Statistics getStatistics(@RequestParam String month) {
        return transactionService.calculateStatistics(month);
    }

    // API for bar chart
    @GetMapping("/bar-chart")
    public List<PriceRange> getBarChartData(@RequestParam String month) {
        return transactionService.generateBarChartData(month);
    }

    // API for pie chart
    @GetMapping("/pie-chart")
    public Map<String, Integer> getPieChartData(@RequestParam String month) {
        return transactionService.generatePieChartData(month);
    }

    // API to fetch data from all APIs and combine the response
    @GetMapping("/combined-data")
    public CombinedData getCombinedData(@RequestParam String month) {
        return transactionService.getCombinedData(month);
    }
}
