package medhelp.business;

import medhelp.model.Comorbidity;
import medhelp.persistance.ComorbiditiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComorbidityService {

    private final ComorbiditiesRepository comorbiditiesRepository;

    @Autowired
    public ComorbidityService(ComorbiditiesRepository comorbiditiesRepository) {
        this.comorbiditiesRepository = comorbiditiesRepository;
    }

    public List<Comorbidity> getAllComorbities(){
        return comorbiditiesRepository.findAll();
    }








}
