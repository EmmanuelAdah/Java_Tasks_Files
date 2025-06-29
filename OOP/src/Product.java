public class Product {
    private final String productName;
    private final String productID;
    private final String productDescription;
    private ProductCategory productCategory;
    private final double Price;

    public Product(String productName, String productID, double price, String productDescription) {
        this.productName = productName;
        this.productID = productID;
        this.productDescription = productDescription;
        Price = price;
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

    public static void setProductCategory(ProductCategory productCategory) {
        for (ProductCategory category : ProductCategory.values()) {
            if (category.equals(productCategory)) {
                productCategory = category;
            }
        }
    }

    public ProductCategory getProductCategory() {
        return productCategory;
    }
}