package com.mavetrial.trial.Dto;


public class ManagerDto {
    
    private int managerID;
    private String managerName;
    private String managerAge;
    private String managerPhone;
    private String managerAddress;
    private String username;
    private String password;

    
    public ManagerDto() {}

    public ManagerDto(int managerID, String managerName, String managerAge, String managerPhone, String managerAddress,
            String username, String password) {
        this.managerID = managerID;
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
