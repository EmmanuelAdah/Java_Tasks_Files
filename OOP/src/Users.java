public class Users {
    private final String name;
    private final int age;
    private final String email;
    private final String homeAddress;
    private final String password;
    private final String phoneNumber;

    public Users(String name, int age, String email, String homeAddress, String password, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.homeAddress = homeAddress;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public static String getName(String name) {
        return name;
    }

    public static int getAge(int age) {
        return age;
    }

    public static String getEmail(String email) {
        return email;
    }

    public static String getHomeAddress(String homeAddress) {
        return homeAddress;
    }

    public static String getPassword(String password) {
        return password;
    }


}