package com.mavetrial.trial.Mapper;

import com.mavetrial.trial.Dto.EquipmentDto;
import com.mavetrial.trial.Entity.Equipment;

public class EquipmentMapper {
    public static EquipmentDto mapToEquipmentDto (Equipment equipment){
        return new EquipmentDto(
            equipment.getEquID(),
            equipment.getEquiName(),
            equipment.getEquiCategory(),
            equipment.getEquiStatus()
        );
    }
    public static Equipment mapToEquipment (EquipmentDto equipmentDto){
        return new Equipment(
            equipmentDto.getEquiName(),
            equipmentDto.getEquiCategory(),
            equipmentDto.getEquiStatus()
        );
    }

}
