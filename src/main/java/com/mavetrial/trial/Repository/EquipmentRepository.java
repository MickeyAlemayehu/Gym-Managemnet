package com.mavetrial.trial.Repository;

import org.springframework.stereotype.Repository;
import java.util.List;
import com.mavetrial.trial.Entity.Equipment;
import org.springframework.data.jpa.repository.JpaRepository; 

@Repository
public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {
     List<Equipment> findByName(String name); 
    }