package com.mavetrial.trial.Mapper;

import com.mavetrial.trial.Dto.ActivityClassDto;
import com.mavetrial.trial.Entity.ActivityClass;

public class ActivityClassMapper {
    public static ActivityClassDto mapToClassDto(ActivityClass activityClass){
        return new ActivityClassDto(
            activityClass.getClassID(),
            activityClass.getClassName(),
            activityClass.getSchedule(),
            activityClass.getCapacity(),
            activityClass.getTrainerID()
        );
    }

    public static ActivityClass mapToClass(ActivityClassDto activityClassDto){
        return new ActivityClass(
            activityClassDto.getClassName(),
            activityClassDto.getSchedule(),
            activityClassDto.getCapacity(),
            activityClassDto.getTrainerID()
        );
    }
}
