package com.mavetrial.trial.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Trainer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trainerID;

    @Column(name = "trainerName")
    private String trainerName;

    @Column(name = "trainerAge")
    private String trainerAge;

    @Column(name = "trainerPhone")
    private String trainerPhone;

    @Column(name = "trainerAddress")
    private String trainerAddress;

    @Column(name = "classID")
    private int classID;

    public Trainer(String trainerName, String trainerAge, String trainerPhone, String trainerAddress, int classID) {
        this.trainerName = trainerName;
        this.trainerAge = trainerAge;
        this.trainerPhone = trainerPhone;
        this.trainerAddress = trainerAddress;
        this.classID = classID;
    }

    public int getTrainerID() {
        return trainerID;
    }

    public void setTrainerID(int trainerID) {
        this.trainerID = trainerID;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public String getTrainerAge() {
        return trainerAge;
    }

    public void setTrainerAge(String trainerAge) {
        this.trainerAge = trainerAge;
    }

    public String getTrainerPhone() {
        return trainerPhone;
    }

    public void setTrainerPhone(String trainerPhone) {
        this.trainerPhone = trainerPhone;
    }

    public String getTrainerAddress() {
        return trainerAddress;
    }

    public void setTrainerAddress(String trainerAddress) {
        this.trainerAddress = trainerAddress;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }


}
