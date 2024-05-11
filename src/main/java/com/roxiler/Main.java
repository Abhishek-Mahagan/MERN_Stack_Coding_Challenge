package com.roxiler;



import com.roxiler.model.CombinedData;
import com.roxiler.service.TransactionService;

public class Main {

    public static void main(String[] args) {
        // Create an instance of TransactionService
        TransactionService transactionService = new TransactionService();

        // Initialize the database
        transactionService.initializeDatabase();

        // Example: Get combined data for a specific month
        String month = "January"; // Example month
        CombinedData combinedData = transactionService.getCombinedData("January");
        System.out.println("Combined Data for January: " + combinedData);

    }
}
