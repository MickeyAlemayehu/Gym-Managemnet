package com.mavetrial.trial.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.mavetrial.trial.Entity.ActivityClass;

@Repository
public interface ActivityClassRepository extends JpaRepository<ActivityClass, Integer>{
    List<ActivityClass> findByName(String name);
}
