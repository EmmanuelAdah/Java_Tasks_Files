import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstoreTest {

    @Test
    public void checkForUserName(){
        String userName = "Emma";
        assertEquals("Emma", Users.getName(userName));
    }

    @Test
    public void checkForUsersAge (){
        assertEquals(17, Users.getAge(17));
    }

    @Test
    public void checkForEmail (){
        assertEquals("emma@gmail.com", Users.getEmail("emma@gmail.com"));
    }

    @Test
    public void checkForHomeAddress (){
        assertEquals("No 32, Sabo, Yaba", Users.getHomeAddress("No 32, Sabo, Yaba"));
    }

    @Test
    public void checkForPassword (){
        assertEquals("Adah02", Users.getPassword("Adah02"));
    }

    @Test
    public void checkForPhoneNumber (){
        assertEquals("0806438273", Users.getName("0806438273"));
    }

    @Test
    public void checkForProductName (){
        assertEquals("tea", Product.getProductName("tea"));
    }

    @Test
    public void checkForProductID (){
        assertEquals("IP24535", Product.getProductID("IP24535"));
    }
}