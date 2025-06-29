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

    Product product = new Product("tea", "IP24535", 2_000, "For making tea and coffee");

    @Test
    public void checkForProductName (){
        assertEquals("tea", product.getProductName());
    }

    @Test
    public void checkForProductID (){
        assertEquals("IP24535", product.getProductID());
    }

    @Test
    public void checkForProductPrice (){
        assertEquals(2_000, product.getPrice());
    }

    @Test
    public void checkForProductDescription (){
        assertEquals("For making tea and coffee", product.getProductDescription());
    }

    CreditCard creditCard = new CreditCard("Emma Adah", "63746374634676", 11, 2026, 117);

    @Test
    public void checkForCreditCardName (){
        assertEquals("Emma Adah", creditCard.getCardName());
    }

    @Test
    public void checkForCreditCardNumber (){
        assertEquals("63746374634676", creditCard.getCardNumber());
    }

    @Test
    public void checkForCreditCardExpiryMonth (){
        assertEquals(11, creditCard.getExpiryMonth());
    }

    @Test
    public void checkForCreditCardExpiryYear (){
        assertEquals(2026, creditCard.getExpiryYear());
    }

    @Test
    public void checkForCreditCardCVV (){
        assertEquals(117, creditCard.getCardCvv());
    }
}