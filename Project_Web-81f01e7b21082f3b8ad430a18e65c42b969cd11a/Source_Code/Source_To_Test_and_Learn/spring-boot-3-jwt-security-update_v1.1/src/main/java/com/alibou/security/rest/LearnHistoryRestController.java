package com.alibou.security.rest;

import com.alibou.security.entity.LearnHistory;
import com.alibou.security.service.LearnHistoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LearnHistoryRestController {

    private LearnHistoryService learnHistoryService;

    public LearnHistoryRestController(LearnHistoryService learnHistoryService) {
        this.learnHistoryService = learnHistoryService;
    }

    @GetMapping("/learn-history")
    public List<LearnHistory> findAll() {
        List<LearnHistory> learnHistories = learnHistoryService.findAll();
        return learnHistories;
    }

    @GetMapping("/learn-history/{id}")
    public LearnHistory getLearnHistoryById(@PathVariable int id) {
        LearnHistory learnHistory = learnHistoryService.findById(id);
        if (learnHistory == null) {
            throw new RuntimeException("LearnHistory id not found: " + id);
        }
        return learnHistory;
    }

    @PostMapping("/learn-history")
    public LearnHistory addLearnHistory(@RequestBody LearnHistory learnHistory) {
        learnHistory.setId(0);
        LearnHistory savedLearnHistory = learnHistoryService.save(learnHistory);
        return savedLearnHistory;
    }

    @PutMapping("/learn-history")
    public LearnHistory updateLearnHistory(@RequestBody LearnHistory learnHistory) {
        LearnHistory updatedLearnHistory = learnHistoryService.save(learnHistory);
        return updatedLearnHistory;
    }

    @DeleteMapping("/learn-history/{id}")
    public String deleteLearnHistory(@PathVariable int id) {
        LearnHistory learnHistory = learnHistoryService.findById(id);
        if (learnHistory == null) {
            throw new RuntimeException("LearnHistory id not found: " + id);
        }
        learnHistoryService.deleteById(id);
        return "Deleted LearnHistory with id: " + id;
    }
}
