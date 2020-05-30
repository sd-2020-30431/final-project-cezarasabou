package medhelp.export.factory;

public class AbstractFactory<T> {
    T create(ReportType reportType);
}

