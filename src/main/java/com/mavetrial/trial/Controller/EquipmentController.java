package com.mavetrial.trial.Controller;

import com.mavetrial.trial.Dto.EquipmentDto;
import com.mavetrial.trial.Service.EquipmentService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/equipment")

public class EquipmentController {

    private EquipmentService equipmentService;
    

    public EquipmentController(EquipmentService equipmentService) {
        this.equipmentService = equipmentService;
    }

    @PostMapping
    public ResponseEntity <EquipmentDto> addEquipment(@RequestBody EquipmentDto equipmentDto){
        EquipmentDto savedEquipment = equipmentService.addEquipment(equipmentDto);
        return new ResponseEntity <> (savedEquipment, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity <EquipmentDto> getEquipmnetById(@PathVariable int equID){
        EquipmentDto equipmentDto = equipmentService.getEquipmentById(equID);
        return ResponseEntity.ok(equipmentDto);
    }
}
