package com.mavetrial.trial.Dto;


public class EquipmentDto {
    private  int equID;
    private  String equiName;
    private String equiCategory;
    private String equiStatus;
    
    public EquipmentDto() {
    }

    public EquipmentDto(int equID, String equiName, String equiCategory, String equiStatus) {
        this.equID = equID;
        this.equiName = equiName;
        this.equiCategory = equiCategory;
        this.equiStatus = equiStatus;
    }

    public EquipmentDto(String equiName, String equiCategory, String equiStatus) {
        this.equiName = equiName;
        this.equiCategory = equiCategory;
        this.equiStatus = equiStatus;
    }

    public int getEquID() {
        return equID;
    }

    public void setEquID(int equID) {
        this.equID = equID;
    }

    public String getEquiName() {
        return equiName;
    }

    public void setEquiName(String equiName) {
        this.equiName = equiName;
    }

    public String getEquiCategory() {
        return equiCategory;
    }

    public void setEquiCategory(String equiCategory) {
        this.equiCategory = equiCategory;
    }

    public String getEquiStatus() {
        return equiStatus;
    }

    public void setEquiStatus(String equiStatus) {
        this.equiStatus = equiStatus;
    }
    
}
