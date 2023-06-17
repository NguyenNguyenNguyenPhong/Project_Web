package com.alibou.security.service;

import com.alibou.security.dao.LearnHistoryRepository;
import com.alibou.security.entity.LearnHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LearnHistoryServiceIml implements LearnHistoryService {

    private LearnHistoryRepository learnHistoryRepository;

    @Autowired
    public LearnHistoryServiceIml(LearnHistoryRepository learnHistoryRepository) {
        this.learnHistoryRepository = learnHistoryRepository;
    }

    @Override
    public List<LearnHistory> findAll() {
        return learnHistoryRepository.findAll();
    }

    @Override
    public LearnHistory findById(int id) {
        Optional<LearnHistory> result = learnHistoryRepository.findById(id);
        LearnHistory learnHistory = null;
        if (result.isPresent()) {
            learnHistory = result.get();
        } else {
            throw new RuntimeException("Did not find LearnHistory id: " + id);
        }
        return learnHistory;
    }

    @Override
    public LearnHistory save(LearnHistory learnHistory) {
        return learnHistoryRepository.save(learnHistory);
    }

    @Override
    public void deleteById(int id) {
        learnHistoryRepository.deleteById(id);
    }
}
