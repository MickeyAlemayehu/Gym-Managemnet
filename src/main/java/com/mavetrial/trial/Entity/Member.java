package com.mavetrial.trial.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberID;

    @Column(name = "memberName")
    private String memberName;

    @Column(name = "memberAge")
    private int memberAge;

    @Column(name = "memberPhone")
    private String memberPhone;

    @Column(name = "memberAddress")
    private String memberAddress;

    @Column(name = "membership_plan")
    private String membership_plan;

    @Column(name = "exipryDate")
    private String expiryDate;

    @Column(name = "classID")
    private int classID;

    public Member(String memberName, int memberAge, String memberPhone, String memberAddress,
            String membership_plan, String expiryDate ,int classID) {
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
