package weekly1;

public class Product {

    String name;
    double weight;
    double price;

    Product(String name, double weight, double price){
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    int deliveryChargeWeight(double weight){
        if(weight<3){
           return 1000;

        } else if (weight<10) {
            return 5000;
        }
        else{
            return 10000;
        }
    }

    int deliveryChargePrice(double price, double weight){
        if(price<30000){
            return deliveryChargeWeight(this.weight);

        } else if (price<100000) {
            return deliveryChargeWeight(this.weight)-1000;
        }
        else{
            return 0;
        }

    }
}


