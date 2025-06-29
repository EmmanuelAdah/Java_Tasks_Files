public class Items extends Product{
    private final int quantity;

    public Items(int quantity, String productName, String productID, double price, String productDescription) {
        super(productName, productID, price, productDescription);
        this.quantity = quantity;
    }

}
