public class Address extends Billing {

    private final String country;
    private final String state;
    private final String city;
    private final String street;
    private final String houseNumber;

    public Address(String name, int age, String email, String homeAddress, String password, String phoneNumber, String country, String state, String city, String street, String houseNumber) {
        super(name, age, email, homeAddress, password, phoneNumber);
        this.country = country;
        this.state = state;
        this.city = city;
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }
}