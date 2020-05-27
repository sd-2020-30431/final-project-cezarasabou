package medhelp.business;

import medhelp.exception.ResourceNotFoundException;
import medhelp.model.BloodTest;
import medhelp.persistance.BloodTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;
import java.util.List;

@Service
public class BloodTestService {

    private final BloodTestRepository bloodTestRepository;

    @Autowired
    public BloodTestService(BloodTestRepository bloodTestRepository) {
        this.bloodTestRepository = bloodTestRepository;
    }

    public List<BloodTest> getAllBloodTests(){
        return bloodTestRepository.findAll();
    }

    public BloodTest getBloodTestById(Long bloodTestId) throws ResourceNotFoundException{
        BloodTest bloodTest = bloodTestRepository.findById(bloodTestId)
                .orElseThrow(() -> new ResourceNotFoundException("Item not found for this id :: " + bloodTestId));
        return bloodTest;
    }

    public BloodTest createBloodTest(BloodTest bloodTest){
        return bloodTestRepository.save(bloodTest);
    }

    public BloodTest updateBloodTest(Long bloodTestId, BloodTest bloodTestDetails) throws ResourceNotFoundException{
        BloodTest bloodTest = bloodTestRepository.findById(bloodTestId)
                .orElseThrow(() -> new ResourceNotFoundException("Blood test not found for this id :: " + bloodTestId));

        bloodTest.setAlat(bloodTest.getAlat());
        bloodTest.setAsat(bloodTest.getAsat());
        bloodTest.setBloodSugar(bloodTest.getBloodSugar());
        bloodTest.setC_reactiveProtein(bloodTest.getC_reactiveProtein());
        bloodTest.setCreatinine(bloodTest.getCreatinine());
        bloodTest.setFerritin(bloodTest.getFerritin());
        bloodTest.setFibrinogen(bloodTest.getFibrinogen());
        bloodTest.setHemoglobin(bloodTest.getHemoglobin());
        bloodTest.setLdh(bloodTest.getLdh());
        bloodTest.setLeukocytes(bloodTest.getLeukocytes());
        bloodTest.setLymphocytes(bloodTest.getLymphocytes());
        bloodTest.setPlatelets(bloodTest.getPlatelets());
        bloodTest.setProcalcitonin(bloodTest.getProcalcitonin());
        bloodTest.setUrea(bloodTest.getUrea());

        final BloodTest updatedBloodTest = bloodTestRepository.save(bloodTest);
        return updatedBloodTest;
    }


    public void deleteBloodTest(Long bloodTestId) throws ResourceNotFoundException{
        BloodTest bloodTest = bloodTestRepository.findById(bloodTestId)
                .orElseThrow(() -> new ResourceNotFoundException("Blood test not found for this id :: " + bloodTestId));
        bloodTestRepository.delete(bloodTest);
    }



}
