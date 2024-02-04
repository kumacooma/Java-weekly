package weekly1;

public class Grocery extends Product implements DeliveryChargeCalculator{
    Grocery(String name, double weight, double price) {
        super(name, weight, price);
    }

    @Override
    public int getDeliveryCharge(double price, double weight) {
        return deliveryChargePrice(price,weight);
    }
}