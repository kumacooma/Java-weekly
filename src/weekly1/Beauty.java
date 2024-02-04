package weekly1;

public class Beauty extends Product implements DeliveryChargeCalculator{
    Beauty(String name, double weight, double price) {
        super(name, weight, price);
    }

    @Override
    public int getDeliveryCharge(double price, double weight) {
        return deliveryChargePrice(price,weight);
    }


}
