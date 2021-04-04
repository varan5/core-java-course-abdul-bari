package codes.practice2;

class BikeService {
    private int totalNumberOfServicesAvailableCount;
    private int numberOfServicesUsedCount;
    private int firstServiceNumber;

    public void setFirstServiceNumber(int firstServiceNumber) {
        this.firstServiceNumber = firstServiceNumber;
    }
    public void setNumberOfServicesUsedCount(int numberOfServicesUsedCount) {
        this.numberOfServicesUsedCount = numberOfServicesUsedCount;
    }
    public void setTotalNumberOfServicesAvailableCount(int totalNumberOfServicesAvailableCount) {
        this.totalNumberOfServicesAvailableCount = totalNumberOfServicesAvailableCount;
    }
    public int getFirstServiceNumber() {
        return firstServiceNumber;
    }
    public int getNumberOfServicesUsedCount() {
        return numberOfServicesUsedCount;
    }
    public int getTotalNumberOfServicesAvailableCount() {
        return totalNumberOfServicesAvailableCount;
    }
}
