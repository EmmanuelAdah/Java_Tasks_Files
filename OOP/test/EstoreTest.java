import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstoreTest {

    Users users = new Users("Emma", 17, "emma@gmail.com", "No 32, Sabo-Yaba", "Adah02", "0806438273");

    @Test
    public void checkForUserName(){
        assertEquals("Emma", users.getName());
    }

    @Test
    public void checkForUsersAge (){
        assertEquals(17, users.getAge());
    }

    @Test
    public void checkForEmail (){
        assertEquals("emma@gmail.com", users.getEmail());
    }

    @Test
    public void checkForHomeAddress (){
        assertEquals("No 32, Sabo-Yaba", users.getHomeAddress());
    }

    @Test
    public void checkForPassword (){
        assertEquals("Adah02", users.getPassword());
    }

    @Test
    public void checkForPhoneNumber (){
        assertEquals("0806438273", users.getPhoneNumber());
    }

    Items items = new Items("tea", "IP24535", 2_000, "For making tea and coffee", 4, ProductCategory.GROCERIES);

    @Test
    public void checkForProductName (){
        assertEquals("tea", items.getProductName());
    }

    @Test
    public void checkForProductID (){
        assertEquals("IP24535", items.getProductID());
    }

    @Test
    public void checkForProductPrice (){
        assertEquals(2_000, items.getPrice());
    }

    @Test
    public void checkForProductDescription (){
        assertEquals("For making tea and coffee", items.getProductDescription());
    }

    @Test
    public void checkForProductQuantity (){
        assertEquals(4, items.getProductQuantity());
    }

    @Test
    public void checkForProductCategory (){
        assertEquals("GROCERIES", items.getProductCategory());
    }

    Billing billing = new Billing("Emma Adah", "08160509785", "63746374634676", 11, 2026, 117, CardType.MASTERCARD);

    @Test
    public void checkForCreditCardName (){
        assertEquals("Emma Adah", billing.getCardName());
    }

    @Test
    public void checkForCreditCardNumber (){
        assertEquals("63746374634676", billing.getCardNumber());
    }

    @Test
    public void checkForCreditCardExpiryMonth (){
        assertEquals(11, billing.getExpiryMonth());
    }

    @Test
    public void checkForCreditCardExpiryYear (){
        assertEquals(2026, billing.getExpiryYear());
    }

    @Test
    public void checkForCreditCardCVV (){
        assertEquals(117, billing.getCardCvv());
    }

    @Test
    public void checkForBillingPhoneNumber (){
        assertEquals("08160509785", billing.getPhoneNumber());
    }

    @Test
    public void checkForCardType (){
        assertEquals("MASTERCARD", billing.getCardType());
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