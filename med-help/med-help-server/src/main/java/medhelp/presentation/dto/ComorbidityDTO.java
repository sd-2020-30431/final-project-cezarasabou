package medhelp.presentation.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ComorbidityDTO {

    private long comorbidity_id;
    private Boolean chronicLungDisease;
    private Boolean heartDisease;
    private Boolean venousThrombosis;
    private Boolean cancer;
    private Boolean diabetes;
    private Boolean obesity;
    private Boolean kidneyDisease;
    private Boolean liverDisease;
    private Boolean neurologicalDisease;
    private Boolean autoimmuneDisease;

    public long getComorbidity_id() {
        return comorbidity_id;
    }

    public void setComorbidity_id(long comorbidity_id) {
        this.comorbidity_id = comorbidity_id;
    }

    public Boolean getChronicLungDisease() {
        return chronicLungDisease;
    }

    public void setChronicLungDisease(Boolean chronicLungDisease) {
        this.chronicLungDisease = chronicLungDisease;
    }

    public Boolean getHeartDisease() {
        return heartDisease;
    }

    public void setHeartDisease(Boolean heartDisease) {
        this.heartDisease = heartDisease;
    }

    public Boolean getVenousThrombosis() {
        return venousThrombosis;
    }

    public void setVenousThrombosis(Boolean venousThrombosis) {
        this.venousThrombosis = venousThrombosis;
    }

    public Boolean getCancer() {
        return cancer;
    }

    public void setCancer(Boolean cancer) {
        this.cancer = cancer;
    }

    public Boolean getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(Boolean diabetes) {
        this.diabetes = diabetes;
    }

    public Boolean getObesity() {
        return obesity;
    }

    public void setObesity(Boolean obesity) {
        this.obesity = obesity;
    }

    public Boolean getKidneyDisease() {
        return kidneyDisease;
    }

    public void setKidneyDisease(Boolean kidneyDisease) {
        this.kidneyDisease = kidneyDisease;
    }

    public Boolean getLiverDisease() {
        return liverDisease;
    }

    public void setLiverDisease(Boolean liverDisease) {
        this.liverDisease = liverDisease;
    }

    public Boolean getNeurologicalDisease() {
        return neurologicalDisease;
    }

    public void setNeurologicalDisease(Boolean neurologicalDisease) {
        this.neurologicalDisease = neurologicalDisease;
    }

    public Boolean getAutoimmuneDisease() {
        return autoimmuneDisease;
    }

    public void setAutoimmuneDisease(Boolean autoimmuneDisease) {
        this.autoimmuneDisease = autoimmuneDisease;
    }
}
