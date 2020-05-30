package medhelp.export.decorator;

import medhelp.export.report.Report;
import medhelp.presentation.dto.MedicalHistoryDTO;

public abstract class ReportDecorator implements Report {

    protected Report decoratedReport;


    public ReportDecorator(Report decoratedReport) {
        this.decoratedReport = decoratedReport;
    }

    @Override
    public void dumpReport(MedicalHistoryDTO medicalHistoryDTO) {
        decoratedReport.dumpReport(medicalHistoryDTO);
    }

}
