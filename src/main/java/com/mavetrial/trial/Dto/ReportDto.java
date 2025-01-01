package com.mavetrial.trial.Dto;

public class ReportDto {
    private int reportID;
    private String reportDate;
    
    public ReportDto(int reportID, String reportDate) {
        this.reportID = reportID;
        this.reportDate = reportDate;
    }

    public ReportDto() {
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
