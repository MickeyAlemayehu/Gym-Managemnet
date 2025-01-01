package com.mavetrial.trial.Service;

import java.util.List;
import com.mavetrial.trial.Dto.TrainerDto;

public interface TrainerService {
    TrainerDto addTrainer(TrainerDto trainerDto);

    TrainerDto getTrainerByID (int trainerID);

    List<TrainerDto> getAllTrainer ();
}
