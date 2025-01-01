package com.mavetrial.trial.Mapper;

import com.mavetrial.trial.Dto.ManagerDto;
import com.mavetrial.trial.Entity.Manager;

public class ManagerMapper {
    
    public static ManagerDto mapToManagerDto(Manager manager){
        return new ManagerDto(
            manager.getManagerID(),
            manager.getManagerName(),
            manager.getManagerAge(),
            manager.getManagerPhone(),
            manager.getManagerAddress(),
            manager.getUsername(),
            manager.getPassword()
        );
    }
}
