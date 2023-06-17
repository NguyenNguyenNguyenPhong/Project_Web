package com.alibou.security.dao;


import com.alibou.security.entity.LearnHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LearnHistoryRepository extends JpaRepository<LearnHistory, Integer> {
}
