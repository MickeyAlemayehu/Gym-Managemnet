package com.mavetrial.trial.Mapper;

import com.mavetrial.trial.Dto.ReportDto;
import com.mavetrial.trial.Entity.Report;

public class ReportMapper {
    public static ReportDto mapToReportDto(Report report){
        return new ReportDto(
            report.getReportID(),
            report.getReportDate()
        );
    }
}
