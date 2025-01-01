package com.mavetrial.trial.Repository;

import java.util.List;
import com.mavetrial.trial.Entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer>{
    List<Trainer> findByName(String name);
}
