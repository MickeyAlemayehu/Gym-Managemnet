package com.mavetrial.trial.Mapper;

import com.mavetrial.trial.Dto.TrainerDto;
import com.mavetrial.trial.Entity.Trainer;

public class TrainerMapper {
    public static TrainerDto mapToTrainerDto (Trainer trainer){
        return new TrainerDto(
            trainer.getTrainerID(),
            trainer.getTrainerName(),
            trainer.getTrainerAge(),
            trainer.getTrainerPhone(),
            trainer.getTrainerAddress(),
            trainer.getClassID()
        );
    }
    public static Trainer mapToTrainer (TrainerDto trainerDto){
        return new Trainer(
            trainerDto.getTrainerName(),
            trainerDto.getTrainerAge(),
            trainerDto.getTrainerPhone(),
            trainerDto.getTrainerAddress(),
            trainerDto.getClassID()
        );
    }
}
