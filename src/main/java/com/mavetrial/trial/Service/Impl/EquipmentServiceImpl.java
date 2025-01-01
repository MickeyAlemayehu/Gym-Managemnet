package com.mavetrial.trial.Service.Impl;


import org.springframework.stereotype.Service;
import java.util.List;
import com.mavetrial.trial.Dto.EquipmentDto;
import com.mavetrial.trial.Entity.Equipment;
import com.mavetrial.trial.Expection.ResourceNotFound;
import com.mavetrial.trial.Mapper.EquipmentMapper;
import com.mavetrial.trial.Repository.EquipmentRepository;
import com.mavetrial.trial.Service.EquipmentService;
import java.util.stream.Collectors;

@Service
public class EquipmentServiceImpl implements EquipmentService{

    private EquipmentRepository equipmentRepository;

    public EquipmentServiceImpl(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    @Override
    public EquipmentDto addEquipment(EquipmentDto equipmentDto){
        Equipment equipment = EquipmentMapper.mapToEquipment(equipmentDto);
        Equipment savedEquipment = equipmentRepository.save(equipment);
        return EquipmentMapper.mapToEquipmentDto(savedEquipment);
    }

    @Override
    public EquipmentDto getEquipmentById(int equID) {
        Equipment equipment = equipmentRepository.findById(equID)
          .orElseThrow (() -> new ResourceNotFound("Equipment with ID " + equID + " not found"));
        return EquipmentMapper.mapToEquipmentDto(equipment);
    }

    @Override
    public List<EquipmentDto> getAllEquipment() {
        List<Equipment> equipments = equipmentRepository.findAll();
        return equipments.stream()
                .map(equipment -> EquipmentMapper.mapToEquipmentDto(equipment))
                .collect(Collectors.toList());
    }

    @Override
    public EquipmentDto updateEquipment(int equID, EquipmentDto updatedEquipment) {
        Equipment equipment = equipmentRepository.findById(equID)
          .orElseThrow (() -> new ResourceNotFound("Equipment with ID " + equID + " not found"));
          equipment.setEquiName(updatedEquipment.getEquiName());
          equipment.setEquiCategory(updatedEquipment.getEquiCategory());
          equipment.setEquiStatus(updatedEquipment.getEquiStatus());
          Equipment updatedEquipmentObj = equipmentRepository.save(equipment);
        return EquipmentMapper.mapToEquipmentDto(updatedEquipmentObj);
    }

    @Override
    public void deleteEquipmentById(int equID) {
        equipmentRepository.findById(equID)
          .orElseThrow (() -> new ResourceNotFound("Equipment with ID " + equID + " not found"));
          equipmentRepository.deleteById(equID);
    }


}
