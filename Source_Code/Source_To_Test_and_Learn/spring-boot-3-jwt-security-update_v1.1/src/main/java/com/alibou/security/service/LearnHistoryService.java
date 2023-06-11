package com.alibou.security.service;



import com.alibou.security.entity.LearnHistory;

import java.util.List;

public interface LearnHistoryService {

    List<LearnHistory> findAll();

    LearnHistory findById(int id);

    LearnHistory save(LearnHistory learnHistory);

    void deleteById(int id);
}
