package medhelp.model;

import javax.persistence.*;

@Entity
public class Symptom {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long symptom_id;

    @Column(name = "symptom_name", nullable = false)
    private int symptomName;

    public Symptom() {

    }

    public long getSymptom_id() {
        return symptom_id;
    }

    public void setSymptom_id(long symptom_id) {
        this.symptom_id = symptom_id;
    }

    public int getSymptomName() {
        return symptomName;
    }

    public void setSymptomName(int symptomName) {

        this.symptomName = symptomName;
    }


}
