package com.alibou.security.dao;

import com.alibou.security.entity.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, Integer> {
}
