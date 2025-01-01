package com.mavetrial.trial.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int equID;

    @Column(name = "euiName")
    private  String equiName;

    @Column(name= "equiCategory")
    private String equiCategory;

    @Column(name = "equiStatus")
    private String equiStatus;

    public Equipment(String equiName, String equiCategory, String equiStatus) {
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
