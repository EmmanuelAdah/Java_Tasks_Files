public class Items extends Product{
    private int quantity;

    public Items(int quantity, String productName, String productID, double price, String productDescription) {
        super(productName, productID, price, productDescription);
        quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
