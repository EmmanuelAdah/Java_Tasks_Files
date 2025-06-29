public class Address {

    private static String country;
    private String state;
    private String city;
    private String street;
    private String houseNumber;

    public Address(String country, String state, String city, String street, String houseNumber) {
        country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public static void setCountry(String country) {
        country = country.toUpperCase();
    }

    public static String getCountry() {
        return country;
    }
}