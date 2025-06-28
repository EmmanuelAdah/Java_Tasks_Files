public enum ProductCategory {
    ELECTRONICS,
    GROCERIES,
    UTENSILS,
    CLOTHING;

    private String productCategory;

    public static void setCategory(String productCategory) {
        for (ProductCategory category : ProductCategory.values()) {
            if (productCategory.equalsIgnoreCase(category.productCategory)) {
                productCategory = category.productCategory;
            }
        }
    }

    public static String getCategory() {
        return productCategory;
    }
}
