package medhelp.export.report;

import medhelp.presentation.dto.MedicalHistoryDTO;

public interface Report {
    void dumpReport(MedicalHistoryDTO medicalHistoryDTO);
}
