package medhelp.export.decorator;

import medhelp.export.report.Report;
import medhelp.presentation.dto.MedicalHistoryDTO;

import static medhelp.export.decorator.ReportColor.GREEN;

public class GreenReportDecorator extends ReportDecorator{

    public GreenReportDecorator(Report decoratedReport) {
        super(decoratedReport);
    }

    public void setReportColor(ReportColor reportColor) {
        reportColor = GREEN;
    }

    @Override
    public void dumpReport(MedicalHistoryDTO medicalHistoryDTO) {
        super.dumpReport(medicalHistoryDTO);
    }

}
