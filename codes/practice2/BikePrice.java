package codes.practice2;

public class BikePrice {
    private float bikePrice;

    public void setBikePrice(float bikePrice) {
        this.bikePrice = bikePrice;
    }
    public float getBikePrice(String modelName) {
        if (modelName == "Honda-1111")
            this.bikePrice = 100000.00;
            return this.bikePrice; 
    }
}
