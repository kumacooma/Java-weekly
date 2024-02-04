package weekly1;

public class Main {
    public static void main(String[] args) {

        Product product = new Product("파운데이션",1,35000);


        System.out.println("고객님의 상품"+ product.name +"의 배송비는" +product.deliveryChargePrice(product.price, product.weight)+"원 입니다." );
    }
}