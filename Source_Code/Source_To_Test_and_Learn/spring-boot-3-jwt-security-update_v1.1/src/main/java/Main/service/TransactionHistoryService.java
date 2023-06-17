package Main.service;



import Main.entity.TransactionHistory;

import java.util.List;

public interface TransactionHistoryService {

    List<TransactionHistory> findAll();

    TransactionHistory findById(int id);

    TransactionHistory save(TransactionHistory transactionHistory);

    void deleteById(int id);
}
