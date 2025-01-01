package com.mavetrial.trial.Service.Impl;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.mavetrial.trial.Entity.ActivityClass;
import com.mavetrial.trial.Expection.ResourceNotFound;
import com.mavetrial.trial.Mapper.ActivityClassMapper;
import com.mavetrial.trial.Dto.ActivityClassDto;
import com.mavetrial.trial.Repository.ActivityClassRepository;
import com.mavetrial.trial.Service.ActivityClassService;

@Service
public class ActivityClassServiceImpl implements ActivityClassService{
    private ActivityClassRepository activityClassRepository;

    

    public ActivityClassServiceImpl(ActivityClassRepository activityClassRepository) {
        this.activityClassRepository = activityClassRepository;
    }

    @Override
    public ActivityClassDto addActivityClass(ActivityClassDto activityClassDto) {
        ActivityClass activityClass = ActivityClassMapper.mapToClass(activityClassDto);
        activityClassRepository.save(activityClass); 
        return ActivityClassMapper.mapToClassDto(activityClass);
    }

    @Override
    public ActivityClassDto getActivityClassById(int classID) {
        ActivityClass activityClass = activityClassRepository.findById(classID)
         .orElseThrow(() -> new ResourceNotFound("Activity Class with the ID " + classID + " not found"));
        return ActivityClassMapper.mapToClassDto(activityClass);
    }

    @Override
    public List<ActivityClassDto> getAllActivityClass() {
        List <ActivityClass> activityclasses = activityClassRepository.findAll();
        return activityclasses.stream()
        .map((activityclass) -> ActivityClassMapper.mapToClassDto(activityclass))
        .collect(Collectors.toList());
    }   
    
}
