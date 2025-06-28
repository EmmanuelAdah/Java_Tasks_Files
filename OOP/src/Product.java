public class Product {
    private final String productName;
    private final String productID;
    private final double price;
    private final String productDescription;
    private ProductCategory productCategory;

    public Product(String productName, String productID, double price, String productDescription) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.productDescription = productDescription;
    }

    public static String getProductName(String productName) {
        return productName;
    }

    public static String getProductID(String productID) {
        return productID;
    }
}