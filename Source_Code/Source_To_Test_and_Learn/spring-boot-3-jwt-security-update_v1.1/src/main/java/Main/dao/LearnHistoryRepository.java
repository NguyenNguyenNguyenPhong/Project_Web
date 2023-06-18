package Main.dao;


import Main.entity.LearnHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LearnHistoryRepository extends JpaRepository<LearnHistory, Integer> {
}
