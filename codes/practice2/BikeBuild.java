package codes.practice2;

public class BikeBuild {
    private int buildNumber;
    private String modelName;
    private int NOCNumber;

    public int getBuildNumber() {
        return buildNumber;
    }
    public int getNOCNumber() {
        return NOCNumber;
    }
    public String getModelName() {
        return modelName;
    }
    public void setBuildNumber(int buildNumber) {
        this.buildNumber = buildNumber;
    }
    public void setNOCNumber(int nOCNumber) {
        NOCNumber = nOCNumber;
    }
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }
}
