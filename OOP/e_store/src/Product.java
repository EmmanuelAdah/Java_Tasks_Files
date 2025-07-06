public class Product extends Items{
    private final String productName;
    private final String productID;
    private final double Price;
    private final String productDescription;
    private final ProductCategory productCategory;

    public Product(String name, int age, String email, String homeAddress, String password, String phoneNumber, int quantity, String productName, String productID, double price, String productDescription, ProductCategory productCategory) {
        super(name, age, email, homeAddress, password, phoneNumber, quantity);
        this.productName = productName;
        this.productID = productID;
        this.productDescription = productDescription;
        this.Price = price;
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductID() {
        return productID;
    }

    public double getPrice() {
        return Price;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getProductCategory() {
        return productCategory.toString();
    }
}