package medhelp.presentation.mapper;

import medhelp.model.BloodTest;
import medhelp.presentation.dto.BloodTestDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BloodTestMapper {
    BloodTestDTO bloodTestToBloodTestDTO(BloodTest bloodTest);
    BloodTest bloodTestDTOtoBloodTest(BloodTestDTO bloodTestDTO);
}
