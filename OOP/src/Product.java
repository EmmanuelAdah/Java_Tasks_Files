public class Product {
    private String productName;
    private String productID;
    private double price;
    private String productDescription;
    private ProductCategory productCategory;

    public Product(String productName, String productID, double price, String productDescription) {
        productName = productName;
        productID = productID;
        price = price;
        productDescription = productDescription;
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