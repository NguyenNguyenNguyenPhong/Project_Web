package com.alibou.security.service;


import com.alibou.security.dao.TransactionHistoryRepository;
import com.alibou.security.entity.TransactionHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionHistoryServiceImpl implements TransactionHistoryService {

    private TransactionHistoryRepository transactionHistoryRepository;

    @Autowired
    public TransactionHistoryServiceImpl(TransactionHistoryRepository transactionHistoryRepository) {
        this.transactionHistoryRepository = transactionHistoryRepository;
    }

    @Override
    public List<TransactionHistory> findAll() {
        return transactionHistoryRepository.findAll();
    }

    @Override
    public TransactionHistory findById(int id) {
        Optional<TransactionHistory> result = transactionHistoryRepository.findById(id);
        TransactionHistory transactionHistory = null;
        if (result.isPresent()) {
            transactionHistory = result.get();
        } else {
            throw new RuntimeException("Did not find TransactionHistory id: " + id);
        }
        return transactionHistory;
    }

    @Override
    public TransactionHistory save(TransactionHistory transactionHistory) {
        return transactionHistoryRepository.save(transactionHistory);
    }

    @Override
    public void deleteById(int id) {
        transactionHistoryRepository.deleteById(id);
    }
}
