public class Address {

    private final String country;
    private final String state;
    private final String city;
    private final String street;
    private final String houseNumber;

    public Address(String country, String state, String city, String street, String houseNumber) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public void setCountry(String country) {
        country = country.toUpperCase();
    }

    public String getCountry() {
        return country;
    }
}