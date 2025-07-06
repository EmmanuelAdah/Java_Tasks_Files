public class Items extends ShoppingCart{
    private final int quantity;

    public Items(String name, int age, String email, String homeAddress, String password, String phoneNumber, int quantity) {
        super(name, age, email, homeAddress, password, phoneNumber);
        this.quantity = quantity;
    }

    public int getProductQuantity() {
        return quantity;
    }
}
