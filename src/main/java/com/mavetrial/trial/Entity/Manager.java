package com.mavetrial.trial.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int managerID;

    @Column(name = "managerName")
    private String managerName;

    @Column(name = "managerAge")
    private String managerAge;

    @Column(name = "managerPhone")
    private String managerPhone;

    @Column(name = "managerAddress")
    private String managerAddress;
    
    @Column(name = "Username")
    private String username;

    @Column(name = "password")
    private String password;


    public Manager(String managerName, String managerAge, String managerPhone, String managerAddress, String username,
            String password) {
        this.managerName = managerName;
        this.managerAge = managerAge;
        this.managerPhone = managerPhone;
        this.managerAddress = managerAddress;
        this.username = username;
        this.password = password;
    }


    public int getManagerID() {
        return managerID;
    }


    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }


    public String getManagerName() {
        return managerName;
    }


    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }


    public String getManagerAge() {
        return managerAge;
    }


    public void setManagerAge(String managerAge) {
        this.managerAge = managerAge;
    }


    public String getManagerPhone() {
        return managerPhone;
    }


    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }


    public String getManagerAddress() {
        return managerAddress;
    }


    public void setManagerAddress(String managerAddress) {
        this.managerAddress = managerAddress;
    }


    public String getUsername() {
        return username;
    }


    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    
}

