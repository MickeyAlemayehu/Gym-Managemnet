package com.mavetrial.trial.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.mavetrial.trial.Entity.Report;

@Repository
public interface ReportRepository extends JpaRepository<Report, Integer>{
    List<Report> findByName(String name);
}
