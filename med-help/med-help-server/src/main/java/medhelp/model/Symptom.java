package medhelp.model;

import javax.persistence.*;

@Entity
public class Symptom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long symptom_id;

    @Column(name = "symptom_name", nullable = false)
    private String symptomName;

    @Column(name = "symptom_state", nullable = false)
    private Boolean symptomState;


    public Symptom() {

    }

    public long getSymptom_id() {
        return symptom_id;
    }

    public void setSymptom_id(long symptom_id) {
        this.symptom_id = symptom_id;
    }

    public String getSymptomName() {
        return symptomName;
    }

    public void setSymptomName(String symptomName) {

        this.symptomName = symptomName;
    }

    public Boolean getSymptomState() {
        return symptomState;
    }

    public void setSymptomState(Boolean symptomState) {
        this.symptomState = symptomState;
    }


}
