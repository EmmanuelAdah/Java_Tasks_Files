import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstoreTest {
    Product product = new Product("Emma", 17, "emma@gmail.com", "No 32, Sabo-Yaba", "Adah02",
            "0806438273", 2, "Refrigerator", "TD55623", 72500, "Deep Freezer",ProductCategory.GROCERIES);

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

    CreditCard user = new CreditCard("Emma Adah", 17,"emma@gmail.com", "No 32, Sabo-Yaba", "1234",
            "08160509785", "5399 5760 1841 0707", 11, 2026, 117);

    @Test
    public void checkForCreditCardName (){
        assertEquals("Emma Adah", user.getCardName());
    }

    @Test
    public void checkForCreditCardNumber (){
        assertEquals("5399576018410707", user.getCardNumber());
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
        assertEquals(CardType.MASTERCARD, user.getCardType());
    }

    @Test
    public void cardIsInvalidTest(){
        assertEquals("5399576018410707", user.getCardNumber());
    }

    CreditCard card = new CreditCard("Emma Adah", 17,"emma@gmail.com", "No 32, Sabo-Yaba", "1234",
            "08160509785", "4388 5760 1841 0707", 11, 2026, 117);

    @Test
    public void cardIsValidTest(){
        assertEquals("4388576018410707", card.getCardNumber());
    }

    @Test
    public void cardTypeIsValidTest(){
        assertEquals(CardType.VISACARD, card.getCardType());
    }

    Address address = new Address("James",20,"james@gmail.com","Sabo-Yaba","1234",
            "08164834867", "Nigeria", "Lagos", "Sabo", "Macaulay Way", "No 32");

    @Test
    public void addUsersNameTest (){
        assertEquals("James", address.getName());
    }

    @Test
    public void setUsersEmailAddressTest (){
        assertEquals("james@gmail.com", address.getEmail());
    }

    @Test
    public void usersHomeAddressTest (){
        assertEquals("Sabo-Yaba",address.getHomeAddress());
    }

    @Test
    public void getUsersPasswordTest (){
        assertEquals("1234", address.getPassword());
    }

    @Test
    public void usersPhoneNumberTest (){
        assertEquals("08164834867", address.getPhoneNumber());
    }

    @Test
    public void getResidentCountryTest (){
        assertEquals("Nigeria", address.getCountry());
    }

    @Test
    public void checkForResidentState (){
        assertEquals("Lagos", address.getState());
    }

    @Test
    public void checkForResidentCity (){
        assertEquals("Sabo", address.getCity());
    }

    @Test
    public void addResidentStreet (){
        assertEquals("Macaulay Way", address.getStreet());
    }

    @Test
    public void addResidentHouseNumberTest (){
        assertEquals("No 32", address.getHouseNumber());
    }

    Admin admin = new Admin("Adah", 17, "adah02@gmail.com",
            "No 32, Sabo-Yaba", "1234", "08160509785");

    @Test
    public void addAdminNameTest (){
        assertEquals("Adah", admin.getName());
    }

    @Test
    public void addAdminAgeTest (){
        assertEquals(17, admin.getAge());
    }

    @Test
    public void addAdminEmailTest (){
        assertEquals("adah02@gmail.com",  admin.getEmail());
    }

    @Test
    public void setAdminPasswordTest (){
        assertEquals("1234", admin.getPassword());
    }

    @Test
    public void addAdminPhoneTest (){
        assertEquals("08160509785", admin.getPhoneNumber());
    }

    @Test
    public void addBillingAddressTest (){
        assertEquals("No 32, Sabo-Yaba", admin.getHomeAddress());
    }

    Sellers sellers = new Sellers("John", 25, "johnchi@gmail.com", "No 32," +
            " Herbert Macaulay road, Sabo-Yaba", "08134747873", "2345");

    @Test
    public void addSellersNameTest (){
        assertEquals("John", sellers.getName());
    }

    @Test
    public void setSellersAgeTest (){
        assertEquals(25, sellers.getAge());
    }

    @Test
    public void setSellersEmailAddressTest (){
        assertEquals("johnchi@gmail.com", sellers.getEmail());
    }

    @Test
    public void addSellersAddressTest (){
        assertEquals("No 32, Herbert Macaulay road, Sabo-Yaba", sellers.getHomeAddress());
    }
}