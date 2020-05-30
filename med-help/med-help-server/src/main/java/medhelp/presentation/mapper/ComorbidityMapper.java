package medhelp.presentation.mapper;

import medhelp.model.Comorbidity;
import medhelp.presentation.dto.ComorbidityDTO;
import org.mapstruct.Mapper;

@Mapper
public interface ComorbidityMapper {

    ComorbidityDTO comorbidityToComorbidityDTO(Comorbidity comorbidity);
    Comorbidity comorbidityDTOToComorbidity(ComorbidityDTO comorbidityDTO);
}
