package medhelp.presentation.dto;

public class XRayDTO {

    private long xray_id;
    private String imageName;

    public long getXray_id() {
        return xray_id;
    }

    public void setXray_id(long xray_id) {
        this.xray_id = xray_id;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
