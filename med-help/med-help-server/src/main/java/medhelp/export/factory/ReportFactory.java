package medhelp.export.factory;

import medhelp.export.report.MedicalHistoryReport;
import medhelp.export.report.Report;
import medhelp.export.report.ReportType;

public class ReportFactory implements AbstractFactory<Report> {

    @Override
    public Report create(ReportType reportType) {
        return new MedicalHistoryReport();
    }
}
