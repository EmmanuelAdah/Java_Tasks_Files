public class Items extends Product{
    private final int quantity;

    public Items(String productName, String productID, double price, String productDescription, int quantity) {
        super(productName, productID, price, productDescription);
        this.quantity = quantity;
    }

    public int getProductQunatity() {
        return quantity;
    }
}
