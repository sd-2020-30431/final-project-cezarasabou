package medhelp.business;

import medhelp.model.Comorbidity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComorbidityService {

    private final ComorbidityService comorbiditiesService;

    @Autowired
    public ComorbidityService(ComorbidityService comorbidityService) {
        this.comorbiditiesService = comorbidityService;
    }

    public List<Comorbidity> getAllComorbities(){
        return comorbiditiesService.getAllComorbities();
    }








}
