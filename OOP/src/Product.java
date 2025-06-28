public class Product {
    private final String productName;
    private final String productID;
    private final double price;
    private final String productDescription;
    private ProductCategory productCategory;

    public Product(String productName, String productID, double price, String productDescription, ProductCategory productCategory) {
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

    public static int getPrice(int Price) {
        return Price;
    }

    public static String getProductDescription(String productDescription) {
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