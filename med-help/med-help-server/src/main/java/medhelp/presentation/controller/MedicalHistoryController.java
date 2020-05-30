package medhelp.presentation.controller;

import medhelp.business.MedicalHistoryService;
import medhelp.exception.ResourceNotFoundException;
import medhelp.model.MedicalHistory;
import medhelp.presentation.dto.MedicalHistoryDTO;
import medhelp.presentation.mapper.MedicalHistoryMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class MedicalHistoryController {

    private final MedicalHistoryService medicalHistoryService;
    private final MedicalHistoryMapper medicalHistoryMapper;

    public MedicalHistoryController(MedicalHistoryService medicalHistoryService,
                                    MedicalHistoryMapper medicalHistoryMapper) {
        this.medicalHistoryService = medicalHistoryService;
        this.medicalHistoryMapper = medicalHistoryMapper;
    }

    @GetMapping("/medicalHistories")
    public List<MedicalHistoryDTO> getAllMedicalHistories(){
        return medicalHistoryService.getAllMedicalHistories()
                .stream()
                .map(medicalHistoryMapper::medicalHistoryToMedicalHistoryDTO)
                .collect(Collectors.toList());

    }

    @GetMapping("/medicalHistory/{id}")
    public MedicalHistoryDTO getMedicalHistoryById(@PathVariable Long id) throws ResourceNotFoundException {
        return medicalHistoryMapper.medicalHistoryToMedicalHistoryDTO(medicalHistoryService.getMedicalHistoryById(id));
    }

    @PostMapping("/medicalHistory/{id}")
    public MedicalHistoryDTO updateMedicalHistory(@PathVariable Long id, @RequestBody MedicalHistory medicalHistory){
        return medicalHistoryMapper
                .medicalHistoryToMedicalHistoryDTO(medicalHistoryService.updateMedicalHistory(id, medicalHistory));
    }

    @DeleteMapping("/medicalHistory/{id}")
    public void deleteMedicalHistory(@PathVariable Long id){
        medicalHistoryService.deleteMedicalHisotry(id);
    }
}
