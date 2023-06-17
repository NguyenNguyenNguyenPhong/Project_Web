package com.alibou.security.rest;


import com.alibou.security.entity.TransactionHistory;
import com.alibou.security.service.TransactionHistoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TransactionHistoryRestController {

    private TransactionHistoryService transactionHistoryService;

    public TransactionHistoryRestController(TransactionHistoryService transactionHistoryService) {
        this.transactionHistoryService = transactionHistoryService;
    }

    @GetMapping("/transactionhistory")
    public List<TransactionHistory> findAll() {
        List<TransactionHistory> transactionHistories = transactionHistoryService.findAll();
        return transactionHistories;
    }

    @GetMapping("/transactionhistory/{transactionId}")
    public TransactionHistory getTransactionHistoryById(@PathVariable int transactionId) {
        TransactionHistory transactionHistory = transactionHistoryService.findById(transactionId);
        if (transactionHistory == null) {
            throw new RuntimeException("TransactionHistory not found with ID: " + transactionId);
        }
        return transactionHistory;
    }

    @PostMapping("/transactionhistory")
    public TransactionHistory addTransactionHistory(@RequestBody TransactionHistory transactionHistory) {
        transactionHistory.setTransactionID(0);
        TransactionHistory savedTransactionHistory = transactionHistoryService.save(transactionHistory);
        return savedTransactionHistory;
    }

    @PutMapping("/transactionhistory")
    public TransactionHistory updateTransactionHistory(@RequestBody TransactionHistory transactionHistory) {
        TransactionHistory updatedTransactionHistory = transactionHistoryService.save(transactionHistory);
        return updatedTransactionHistory;
    }

    @DeleteMapping("/transactionhistory/{transactionId}")
    public String deleteTransactionHistory(@PathVariable int transactionId) {
        TransactionHistory transactionHistory = transactionHistoryService.findById(transactionId);
        if (transactionHistory == null) {
            throw new RuntimeException("TransactionHistory not found with ID: " + transactionId);
        }
        transactionHistoryService.deleteById(transactionId);
        return "Deleted TransactionHistory with ID: " + transactionId;
    }
}
