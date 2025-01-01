package com.mavetrial.trial.Service;

import com.mavetrial.trial.Dto.ActivityClassDto;
import java.util.List;

public interface ActivityClassService {
    ActivityClassDto addActivityClass(ActivityClassDto activityClassDto);

    ActivityClassDto getActivityClassById(int classID);

    List <ActivityClassDto> getAllActivityClass ();
}
