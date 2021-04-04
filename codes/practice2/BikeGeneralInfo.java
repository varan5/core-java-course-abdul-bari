package codes.practice2;

class BikeGeneralInfo {
    private int numberOfWheels;
    private String bikeName;
    private String brakeType;

    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }
    public String getBikeName() {
        return bikeName;
    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public String getBrakeType() {
        return brakeType;
    }
}