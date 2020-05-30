package medhelp.presentation.mapper;

import medhelp.model.MedicalHistory;
import medhelp.presentation.dto.MedicalHistoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MedicalHistoryMapper {
    MedicalHistoryMapper INSTANCE = Mappers.getMapper(MedicalHistoryMapper.class);
    MedicalHistoryDTO medicalHistoryToMedicalHistoryDTO(MedicalHistory medicalHistory);
    MedicalHistory medicalHistoryDTOToMedicalHistory(MedicalHistoryDTO medicalHistoryDTO);
}
