package medhelp.presentation.controller;

import medhelp.business.MedicalHistoryService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicalHistoryController {


    private final MedicalHistoryService medicalHistoryService;

    //@Autowired
    public MedicalHistoryController(MedicalHistoryService medicalHistoryService) {
        this.medicalHistoryService = medicalHistoryService;
    }




}
