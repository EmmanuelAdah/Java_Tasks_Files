public class Product {
    private String productName;
    private String productID;
    private double price;
    private String productDescription;
    private ProductCategory productCategory;

    public Product(String productName, String productID, double price, String productDescription) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.productDescription = productDescription;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    public String getProductDescription() {
        return productDescription;
    }
}