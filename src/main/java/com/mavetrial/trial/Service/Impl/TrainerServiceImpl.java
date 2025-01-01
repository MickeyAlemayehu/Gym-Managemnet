package com.mavetrial.trial.Service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import com.mavetrial.trial.Dto.TrainerDto;
import com.mavetrial.trial.Entity.Trainer;
import com.mavetrial.trial.Expection.ResourceNotFound;
import com.mavetrial.trial.Mapper.TrainerMapper;
import com.mavetrial.trial.Repository.TrainerRepository;
import com.mavetrial.trial.Service.TrainerService;

public class TrainerServiceImpl implements TrainerService{
    private TrainerRepository trainerRepository;

    public TrainerServiceImpl(TrainerRepository trainerRepository) {
        this.trainerRepository = trainerRepository;
    }

    @Override
    public TrainerDto addTrainer(TrainerDto trainerDto) {
        Trainer trainer = TrainerMapper.mapToTrainer(trainerDto);
        Trainer savedTrainer = trainerRepository.save(trainer);
        return TrainerMapper.mapToTrainerDto(savedTrainer);
    }

    @Override
    public TrainerDto getTrainerByID(int trainerID) {
        Trainer trainer = trainerRepository.findById(trainerID)
        .orElseThrow( () -> new ResourceNotFound("Trainer with the ID " + trainerID + "not found "));
        return TrainerMapper.mapToTrainerDto(trainer);
    }

    @Override
    public List<TrainerDto> getAllTrainer() {
        List <Trainer> trainers = trainerRepository.findAll();
        return trainers.stream()
        .map((trainer) -> TrainerMapper.mapToTrainerDto(trainer))
        .collect(Collectors.toList());
    } 
}
