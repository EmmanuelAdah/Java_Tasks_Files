public class Users {
    private String name;
    private int age;
    private String email;
    private String homeAddress;
    private String password;
    private String phoneNumber;

    public Users(String name, int age, String email, String homeAddress, String password, String phoneNumber) {
        name = name;
        age = age;
        email = email;
        homeAddress = homeAddress;
        password = password;
        phoneNumber = phoneNumber;
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