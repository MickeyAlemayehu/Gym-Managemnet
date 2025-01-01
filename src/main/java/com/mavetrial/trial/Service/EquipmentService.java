package com.mavetrial.trial.Service;

import com.mavetrial.trial.Dto.EquipmentDto;
import java.util.List;

public interface EquipmentService {
    EquipmentDto addEquipment (EquipmentDto equipmentDto);

    EquipmentDto getEquipmentById(int equID);

    List<EquipmentDto> getAllEquipment ();

    EquipmentDto updateEquipment(int equID, EquipmentDto updatedEquipment);

    void deleteEquipmentById (int equID);

}
