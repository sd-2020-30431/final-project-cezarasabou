package medhelp.model;

import javax.persistence.*;

@Entity
public class BloodTest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long blood_test_id;
    @Column(name = "alat", nullable = false)
    private SeverityLevel alat;
    @Column(name = "asat", nullable = false)
    private SeverityLevel asat;
    @Column(name = "blood_sugar", nullable = false)
    private SeverityLevel bloodSugar;
    @Column(name = "creatinine", nullable = false)
    private SeverityLevel creatinine;
    @Column(name = "c_reactive_protein", nullable = false)
    private SeverityLevel C_reactiveProtein;
    @Column(name = "ferritin", nullable = false)
    private SeverityLevel ferritin;
    @Column(name = "fibrinogen", nullable = false)
    private SeverityLevel fibrinogen;
    @Column(name = "hemoglobin", nullable = false)
    private SeverityLevel hemoglobin;
    @Column(name = "ldh", nullable = false)
    private SeverityLevel ldh;
    @Column(name = "leukocytes", nullable = false)
    private SeverityLevel leukocytes;
    @Column(name = "lymphocytes", nullable = false)
    private SeverityLevel lymphocytes;
    @Column(name = "procalcitonin", nullable = false)
    private SeverityLevel procalcitonin;
    @Column(name = "platelets", nullable = false)
    private SeverityLevel platelets;
    @Column(name = "urea", nullable = false)
    private SeverityLevel urea;

    public BloodTest() {
    }

    public long getBlood_test_id() {
        return blood_test_id;
    }

    public void setBlood_test_id(long blood_test_id) {
        this.blood_test_id = blood_test_id;
    }

    public SeverityLevel getAlat() {
        return alat;
    }

    public void setAlat(SeverityLevel alat) {
        this.alat = alat;
    }

    public SeverityLevel getAsat() {
        return asat;
    }

    public void setAsat(SeverityLevel asat) {
        this.asat = asat;
    }

    public SeverityLevel getBloodSugar() {
        return bloodSugar;
    }

    public void setBloodSugar(SeverityLevel bloodSugar) {
        this.bloodSugar = bloodSugar;
    }

    public SeverityLevel getCreatinine() {
        return creatinine;
    }

    public void setCreatinine(SeverityLevel creatinine) {
        this.creatinine = creatinine;
    }

    public SeverityLevel getC_reactiveProtein() {
        return C_reactiveProtein;
    }

    public void setC_reactiveProtein(SeverityLevel c_reactiveProtein) {
        C_reactiveProtein = c_reactiveProtein;
    }

    public SeverityLevel getFerritin() {
        return ferritin;
    }

    public void setFerritin(SeverityLevel ferritin) {
        this.ferritin = ferritin;
    }

    public SeverityLevel getFibrinogen() {
        return fibrinogen;
    }

    public void setFibrinogen(SeverityLevel fibrinogen) {
        this.fibrinogen = fibrinogen;
    }

    public SeverityLevel getHemoglobin() {
        return hemoglobin;
    }

    public void setHemoglobin(SeverityLevel hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public SeverityLevel getLdh() {
        return ldh;
    }

    public void setLdh(SeverityLevel ldh) {
        this.ldh = ldh;
    }

    public SeverityLevel getLeukocytes() {
        return leukocytes;
    }

    public void setLeukocytes(SeverityLevel leukocytes) {
        this.leukocytes = leukocytes;
    }

    public SeverityLevel getLymphocytes() {
        return lymphocytes;
    }

    public void setLymphocytes(SeverityLevel lymphocytes) {
        this.lymphocytes = lymphocytes;
    }

    public SeverityLevel getProcalcitonin() {
        return procalcitonin;
    }

    public void setProcalcitonin(SeverityLevel procalcitonin) {
        this.procalcitonin = procalcitonin;
    }

    public SeverityLevel getPlatelets() {
        return platelets;
    }

    public void setPlatelets(SeverityLevel platelets) {
        this.platelets = platelets;
    }

    public SeverityLevel getUrea() {
        return urea;
    }

    public void setUrea(SeverityLevel urea) {
        this.urea = urea;
    }
}
