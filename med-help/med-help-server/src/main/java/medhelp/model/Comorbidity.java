package medhelp.model;

import javax.persistence.*;

@Entity
public class Comorbidity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long comorbidity_id;
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
    @Column(name = "liver_disease", nullable = false)
    private Boolean liverDisease;
    @Column(name = "neurological_disease", nullable = false)
    private Boolean neurologicalDisease;
    @Column(name = "autoimmune_disease", nullable = false)
    private Boolean autoimmuneDisease;


    public Comorbidity() {
    }

    public long getComorbidity_id() {
        return comorbidity_id;
    }

    public void setComorbidity_id(long comorbidities_id) {
        this.comorbidity_id = comorbidities_id;
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
