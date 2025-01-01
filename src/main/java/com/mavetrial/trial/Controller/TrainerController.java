package com.mavetrial.trial.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mavetrial.trial.Dto.TrainerDto;
import com.mavetrial.trial.Service.TrainerService;

@RestController
@RequestMapping("/api/trainer")
public class TrainerController {
    
    private TrainerService trainerService;

    public TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }

    @PostMapping
   public ResponseEntity <TrainerDto> addTrainer(@RequestBody TrainerDto trainerDto){
        TrainerDto savedTrainer = trainerService.addTrainer(trainerDto);
        return new ResponseEntity<> (savedTrainer, HttpStatus.OK); 
   } 

   @GetMapping("{id}")
   public ResponseEntity <TrainerDto> getTrainerById(@PathVariable int trainerID){
    TrainerDto trainerDto = trainerService.getTrainerByID(trainerID);
    return  ResponseEntity.ok(trainerDto);
   }
}
