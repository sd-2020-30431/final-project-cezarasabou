package medhelp.presentation.mapper;

import medhelp.model.MedicalHistory;
import medhelp.presentation.dto.MedicalHistoryDTO;
import org.mapstruct.Mapper;

@Mapper
public interface MedicalHistoryMapper {
    MedicalHistoryDTO medicalHistoryToMedicalHistoryDTO(MedicalHistory medicalHistory);
    MedicalHistory medicalHistoryDTOToMedicalHistory(MedicalHistoryDTO medicalHistoryDTO);
}
