package com.mavetrial.trial.Dto;

public class ActivityClassDto {
    private int classID;
    private String className;
    private String schedule;
    private String capacity;
    private int trainerID;
    
    public ActivityClassDto() {
    }

    public ActivityClassDto(int classID, String className, String schedule, String capacity, int trainerID) {
        this.classID = classID;
        this.className = className;
        this.schedule = schedule;
        this.capacity = capacity;
        this.trainerID = trainerID;
    }

    public ActivityClassDto(String className, String schedule, String capacity, int trainerID) {
        this.className = className;
        this.schedule = schedule;
        this.capacity = capacity;
        this.trainerID = trainerID;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public int getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(int trainerID) {
        this.trainerID = trainerID;
    }

    
    
}
