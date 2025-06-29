public class Items extends Product{
    private final int quantity;

    public Items(String productName, String productID, double price, String productDescription, int quantity, ProductCategory productCategory) {
        super(productName, productID, price, productDescription, productCategory);
        this.quantity = quantity;
    }

    public int getProductQuantity() {
        return quantity;
    }
}
