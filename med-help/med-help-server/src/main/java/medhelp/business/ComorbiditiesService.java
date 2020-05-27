package medhelp.business;

import medhelp.model.Comorbidity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComorbiditiesService {

    private final ComorbiditiesService comorbiditiesService;

    @Autowired
    public ComorbiditiesService(ComorbiditiesService comorbiditiesService) {
        this.comorbiditiesService = comorbiditiesService;
    }

    public List<Comorbidity> getAllComorbities(){
        return comorbiditiesService.getAllComorbities();
    }

    public Comorbidity
}
