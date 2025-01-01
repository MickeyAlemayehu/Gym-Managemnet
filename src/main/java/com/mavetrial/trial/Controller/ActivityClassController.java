package com.mavetrial.trial.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mavetrial.trial.Dto.ActivityClassDto;
import com.mavetrial.trial.Service.ActivityClassService;

@RestController
@RequestMapping("/api/classes")
public class ActivityClassController {
    
    private ActivityClassService activityClassService;

    public ActivityClassController(ActivityClassService activityClassService) {
        this.activityClassService = activityClassService;
    }
    
    @PostMapping
    public ResponseEntity <ActivityClassDto> addActivityClass(@RequestBody ActivityClassDto activityClassDto){
        ActivityClassDto savedClass = activityClassService.addActivityClass(activityClassDto);
        return new ResponseEntity <> (savedClass, HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity <ActivityClassDto> getActivityClassById (@PathVariable  int classID){
        ActivityClassDto activityClassDto = activityClassService.getActivityClassById(classID);
        return ResponseEntity.ok(activityClassDto);
    } 
}

