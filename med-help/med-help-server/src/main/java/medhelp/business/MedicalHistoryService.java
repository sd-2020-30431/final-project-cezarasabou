package medhelp.business;

import medhelp.exception.ResourceNotFoundException;
import medhelp.model.MedicalHistory;
import medhelp.persistance.MedicalHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalHistoryService {

    private final MedicalHistoryRepository medicalHistoryRepository;

    @Autowired
    public MedicalHistoryService(MedicalHistoryRepository medicalHistoryRepository) {
        this.medicalHistoryRepository = medicalHistoryRepository;
    }

    public List<MedicalHistory> getAllMedicalHistories(){
        return medicalHistoryRepository.findAll();
    }


    public MedicalHistory getMedicalHistoryById(Long medicalHistoryId) throws ResourceNotFoundException {
        return medicalHistoryRepository.findById(medicalHistoryId)
                .orElseThrow(() -> new ResourceNotFoundException("Medical history not found"));
    }

    public MedicalHistory createMedicalHistory(MedicalHistory medicalHistory){
        return medicalHistoryRepository.save(medicalHistory);
    }

    public MedicalHistory updateMedicalHistory(Long medicalHistoryId, MedicalHistory medicalHistory) {
        return medicalHistoryRepository.save(medicalHistory);
    }

    public void deleteMedicalHisotry(Long medicalHistoryId){
        medicalHistoryRepository.deleteById(medicalHistoryId);
    }


}
