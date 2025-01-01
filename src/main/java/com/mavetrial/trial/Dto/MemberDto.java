package com.mavetrial.trial.Dto;


public class MemberDto {
    private int memberID;
    private String memberName;
    private int memberAge;
    private String memberPhone;
    private String memberAddress;
    private String membership_plan;
    private String expiryDate;
    private int classID;
    
    public MemberDto() {
    }

    public MemberDto(int memberID, String memberName, int memberAge, String memberPhone, String memberAddress,
            String membership_plan, String expiryDate, int classID) {
        this.memberID = memberID;
        this.memberName = memberName;
        this.memberAge = memberAge;
        this.memberPhone = memberPhone;
        this.memberAddress = memberAddress;
        this.membership_plan = membership_plan;
        this.expiryDate = expiryDate;
        this.classID = classID;
    }

    public MemberDto(String memberName, int memberAge, String memberPhone, String memberAddress, String membership_plan,
            String expiryDate, int classID) {
        this.memberName = memberName;
        this.memberAge = memberAge;
        this.memberPhone = memberPhone;
        this.memberAddress = memberAddress;
        this.membership_plan = membership_plan;
        this.expiryDate = expiryDate;
        this.classID = classID;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getMembership_plan() {
        return membership_plan;
    }

    public void setMembership_plan(String membership_plan) {
        this.membership_plan = membership_plan;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }  
    
}
