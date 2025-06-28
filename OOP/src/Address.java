public class Address {

    private String country;
    private String state;
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
        if (country.chars().allMatch(Character::isLetter)) {
            this.country = country;
        }
    }

    public void setState(String state) {
        if (state.chars().allMatch(Character::isLetter)) {
            this.state = state;
        }
    }

    public void setCity(String city) {
        if (city.chars().allMatch(Character::isLetter)) {

        }
    }

    public String getCountry() { return country; }

    public String getState() { return state; }

    public String getCity() { return city; }

    public String getStreet() { return street; }

    public String getHouseNumber() { return houseNumber; }
}