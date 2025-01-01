package com.mavetrial.trial.Repository;

import java.util.List;

import com.mavetrial.trial.Entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Manager, Integer> {
    List<Manager> findByName(String name);
}
