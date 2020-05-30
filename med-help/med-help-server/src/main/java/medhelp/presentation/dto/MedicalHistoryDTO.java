package medhelp.presentation.dto;

import javax.persistence.Column;

public class MedicalHistoryDTO {

    private long id;
    private String fever;
    private String cough;
    private String shortnessOfBreath;
    private String chills;
    private String musclePain;
    private String headache;

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
