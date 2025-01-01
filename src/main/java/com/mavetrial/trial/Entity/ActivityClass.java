package com.mavetrial.trial.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ActivityClass {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int classID;

    @Column(name = "className")
    private String className;

    @Column(name = "schedule")
    private String schedule;
    
    @Column(name = "capacity")
    private String capacity;

    @Column(name = "trainerID")
    private int trainerID;

    public ActivityClass(String className, String schedule, String capacity, int trainerID) {
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
