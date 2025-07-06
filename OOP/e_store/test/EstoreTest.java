import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstoreTest {

    Product product = new Product("Emma", 17, "emma@gmail.com", "No 32, Sabo-Yaba", "Adah02", "0806438273", 2, "Refrigerator", "TD55623", 72500, "Deep Freezer",ProductCategory.GROCERIES);

    @Test
    public void checkForUserName(){
        assertEquals("Emma", product.getName());
    }

    @Test
    public void checkForUsersAge (){
        assertEquals(17, product.getAge());
    }

    @Test
    public void checkForEmail (){
        assertEquals("emma@gmail.com", product.getEmail());
    }

    @Test
    public void checkForHomeAddress (){
        assertEquals("No 32, Sabo-Yaba", product.getHomeAddress());
    }

    @Test
    public void checkForPassword (){
        assertEquals("Adah02", product.getPassword());
    }

    @Test
    public void checkForPhoneNumber (){
        assertEquals("0806438273", product.getPhoneNumber());
    }

    @Test
    public void checkForProductName (){
        assertEquals("Refrigerator", product.getProductName());
    }

    @Test
    public void checkForProductID (){
        assertEquals("TD55623", product.getProductID());
    }

    @Test
    public void checkForProductPrice (){
        assertEquals(72500, product.getPrice());
    }

    @Test
    public void checkForProductDescription (){
        assertEquals("Deep Freezer", product.getProductDescription());
    }

    @Test
    public void checkForProductQuantity (){
        assertEquals(2, product.getProductQuantity());
    }

    @Test
    public void checkForProductCategory (){
        assertEquals("GROCERIES", product.getProductCategory());
    }

    CreditCard user = new CreditCard("Emma Adah", 17,"emma@gmail.com", "No 13, Shoyomokun, Lawanson","1234","08160509785", "63746374634676", 11, 2026, 117, CardType.MASTERCARD);

    @Test
    public void checkForCreditCardName (){
        assertEquals("Emma Adah", user.getCardName());
    }

    @Test
    public void checkForCreditCardNumber (){
        assertEquals("63746374634676", user.getCardNumber());
    }

    @Test
    public void checkForCreditCardExpiryMonth (){
        assertEquals(11, user.getExpiryMonth());
    }

    @Test
    public void checkForCreditCardExpiryYear (){
        assertEquals(2026, user.getExpiryYear());
    }

    @Test
    public void checkForCreditCardCVV (){
        assertEquals(117, user.getCardCvv());
    }

    @Test
    public void checkForBillingPhoneNumber (){
        assertEquals("08160509785", user.getPhoneNumber());
    }

    @Test
    public void checkForCardType (){
        assertEquals("MASTERCARD", user.getCardType());
    }

    Address address = new Address("Nigeria", "Lagos", "Yaba", "Sabo", "No 32");

    @Test
    public void checkForResidentCountry (){
        assertEquals("Nigeria", address.getCountry());
    }

    @Test
    public void checkForResidentState (){
        assertEquals("Lagos", address.getState());
    }

    @Test
    public void checkForResidentCity (){
        assertEquals("Yaba", address.getCity());
    }

    @Test
    public void checkForResidentStreet (){
        assertEquals("Sabo", address.getStreet());
    }

    @Test
    public void checkForResidentHouseNumber (){
        assertEquals("No 32", address.getHouseNumber());
    }
}