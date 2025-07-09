package healthProfile;
import java.time.LocalDateTime;

public class HealthProfile {
    private int age;
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private int height;
    private int weight;

    public int getAge() {
        return age;
    }

    public void setAge(int birthDay, int birthMonth, int birthYear) {
        LocalDateTime date = LocalDateTime.now();
        int currentYear = date.getYear();
        int currentMonth = date.getMonthValue();
        int currentDay = date.getDayOfMonth();

        if (birthMonth >= currentMonth && birthDay >= currentDay && birthYear >= currentYear) {
            this.age =currentYear - birthYear;
        } else if (birthYear >= currentYear && birthMonth >= currentMonth) {
            this.age = currentYear - birthYear;
        }
    }
}
