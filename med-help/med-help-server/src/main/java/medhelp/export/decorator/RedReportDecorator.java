package medhelp.export.decorator;

import medhelp.export.report.Report;
import medhelp.presentation.dto.MedicalHistoryDTO;

import static medhelp.export.decorator.ReportColor.RED;

public class RedReportDecorator extends ReportDecorator{
    public RedReportDecorator(Report decoratedReport) {
        super(decoratedReport);
    }

    public void setReportColor(ReportColor reportColor) {
        reportColor = RED;
    }

    @Override
    public void dumpReport(MedicalHistoryDTO medicalHistoryDTO) {
        super.dumpReport(medicalHistoryDTO);
    }

}
