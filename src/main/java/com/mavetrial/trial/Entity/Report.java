package com.mavetrial.trial.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Report {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reportID;

    @Column(name = "reportDate")
    private String reportDate;

    public Report(String reportDate) {
        this.reportDate = reportDate;
    }

    public int getReportID() {
        return reportID;
    }

    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    
}
