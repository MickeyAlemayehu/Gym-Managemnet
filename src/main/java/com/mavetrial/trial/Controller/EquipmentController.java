package com.mavetrial.trial.Controller;

import com.mavetrial.trial.Dto.EquipmentDto;
import com.mavetrial.trial.Service.EquipmentService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public ResponseEntity <EquipmentDto> getEquipmnetById(@PathVariable("id") int equID){
        EquipmentDto equipmentDto = equipmentService.getEquipmentById(equID);
        return ResponseEntity.ok(equipmentDto);
    }
    @GetMapping
   public ResponseEntity <List<EquipmentDto>> getAllEquipmnet(){
    List <EquipmentDto> equiments = equipmentService.getAllEquipment();
    return ResponseEntity.ok(equiments); 
   }

    @PutMapping("{id}")
   public ResponseEntity <EquipmentDto> updatedEquipment(@PathVariable("id") int equID, EquipmentDto updatedEquipment){
       EquipmentDto equipmentDto = equipmentService.updateEquipment(equID, updatedEquipment);
       return ResponseEntity.ok(equipmentDto);
   }

    @DeleteMapping("{id}")
public ResponseEntity<String> deleteEquipmentById(@PathVariable("id") int equID) {
    equipmentService.deleteEquipmentById(equID);
    return ResponseEntity.ok("Equipment Successfully Deleted");
}
}
