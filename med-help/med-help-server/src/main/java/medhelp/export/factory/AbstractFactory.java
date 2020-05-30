package medhelp.export.factory;

import medhelp.export.report.ReportType;

public interface AbstractFactory<T> {
    T create(ReportType reportType);
}

