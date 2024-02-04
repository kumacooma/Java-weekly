package weekly1;

public class LargeAppliance extends Product implements DeliveryChargeCalculator{
    LargeAppliance(String name, double weight, double price) {
        super(name, weight, price);
    }

    @Override
    public int getDeliveryCharge(double price, double weight) {
        return deliveryChargePrice(price,weight);
    }
}