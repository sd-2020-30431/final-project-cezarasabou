package medhelp.model;

import javax.persistence.*;

@Entity
public class Comorbidities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long comorbidities_id;
    @Column(name = "chronic_lung_disease", nullable = false)
    private Boolean chronicLungDisease;
    @Column(name = "heart_disease", nullable = false)
    private Boolean heartDisease;
    @Column(name = "venous_thrombosis", nullable = false)
    private Boolean venousThrombosis;
    @Column(name = "cancer", nullable = false)
    private Boolean cancer;
    @Column(name = "diabetes", nullable = false)
    private Boolean diabetes;
    @Column(name = "obesity", nullable = false)
    private Boolean obesity;
    @Column(name = "kidney_disease", nullable = false)
    private Boolean kidneyDisease;


    public Comorbidities() {
    }

    public long getComorbidities_id() {
        return comorbidities_id;
    }

    public void setComorbidities_id(long comorbidities_id) {
        this.comorbidities_id = comorbidities_id;
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
}
