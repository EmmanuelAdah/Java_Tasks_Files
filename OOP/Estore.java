public class Estore {
    private String name;
    private int age;
    private String email;
    private String homeAddress;
    private String password;
    private String phoneNumber;


    public Estore(String name, int age, String email, String homeAddress, String password, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.homeAddress = homeAddress;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getEmail(){
        return this.email;
    }

    public String getHomeAddress(){
        return this.homeAddress;
    }

    public String getPassword(){
        return this.password;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }
}