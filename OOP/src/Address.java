public class Address {
    private String country;
    private String state;
    private String city;
    private String street;
    private String houseNumber;

    public Address(String country, String state, String city, String street, String houseNumber) {
        country = country;
        state = state;
        city = city;
        street = street;
        houseNumber = houseNumber;
    }

    public String getCountry() { return country; }

    public String getState() { return state; }

    public String getCity() { return city; }

    public String getStreet() { return street; }

    public String getHouseNumber() { return houseNumber; }
}