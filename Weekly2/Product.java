package Weekly2;

import java.math.BigDecimal;

public class Product implements Promotion {
    public String name;
    int price;
    public int weight;

    public Product(String name, int price, int weight){
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public int getDiscountAmount(){
        int discount = 0;

        if (name.equals("grocery")){
            discount = 2000;
        } else if (name.equals("beauty")){
            discount = 10000;
        } else if (name.equals("largeappliance")){
            discount = 0;
        }

        return price-discount;
    }

    public int calculateDeliveryCharge() {
        int finalPrice = getDiscountAmount();

        int deliveryCharge = 0;
        if (weight < 3) {
            deliveryCharge = 1000;
        } else if (weight < 10) {
            deliveryCharge = 5000;
        } else {
            deliveryCharge = 10000;
        }


        if (finalPrice >= 30000 && finalPrice < 100000) {
            deliveryCharge -= 1000;
        } else if (finalPrice > 100000) {
            deliveryCharge = 0;
        }
        return deliveryCharge;
    }
}
