package medhelp.model;

import javax.persistence.*;

@Entity
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "fever", nullable = false)
    private String fever;
    @Column(name = "cough", nullable = false)
    private String cough;
    @Column(name = "shortness_of_breath", nullable = false)
    private String shortnessOfBreath;
    @Column(name = "chills", nullable = false)
    private String chills;
    @Column(name = "muscle_pain", nullable = false)
    private String musclePain;
    @Column(name = "headache", nullable = false)
    private String headache;

    public MedicalHistory() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFever() {
        return fever;
    }

    public void setFever(String fever) {
        this.fever = fever;
    }

    public String getCough() {
        return cough;
    }

    public void setCough(String cough) {
        this.cough = cough;
    }

    public String getShortnessOfBreath() {
        return shortnessOfBreath;
    }

    public void setShortnessOfBreath(String shortnessOfBreath) {
        this.shortnessOfBreath = shortnessOfBreath;
    }

    public String getChills() {
        return chills;
    }

    public void setChills(String chills) {
        this.chills = chills;
    }

    public String getMusclePain() {
        return musclePain;
    }

    public void setMusclePain(String musclePain) {
        this.musclePain = musclePain;
    }

    public String getHeadache() {
        return headache;
    }

    public void setHeadache(String headache) {
        this.headache = headache;
    }
}
