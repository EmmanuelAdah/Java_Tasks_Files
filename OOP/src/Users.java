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

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return email;
    }

    public String getHomeAddress(){
        return homeAddress;
    }

    public String getPassword(){
        return password;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }
}