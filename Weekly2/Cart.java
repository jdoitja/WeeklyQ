package Weekly2;

public class Cart {
    private Product[] products;

    public Cart(Product[] products){
        this.products = products;
    }
    public int calculateDeliveryCharge() {
        int totalCharge = 0;
        for (Product product : products) {
            totalCharge += product.calculateDeliveryCharge();

        }
        return totalCharge;
    }
}
