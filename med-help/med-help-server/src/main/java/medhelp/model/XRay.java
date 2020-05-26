package medhelp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class XRay {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long xray_id;

    private String imageName;

    public XRay() {
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
