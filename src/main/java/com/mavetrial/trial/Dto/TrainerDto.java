package com.mavetrial.trial.Dto;

public class TrainerDto {
    private int trainerID;
    private String trainerName;
    private String trainerAge;
    private String trainerPhone;
    private String trainerAddress;
    private int classID;
    
    public TrainerDto() {
    }

    public TrainerDto(int trainerID, String trainerName, String trainerAge, String trainerPhone, String trainerAddress,
            int classID) {
        this.trainerID = trainerID;
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
