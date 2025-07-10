package heartRates;
import java.time.LocalDateTime;

public class HeartRates {
    private String firstName;
    private String lastName;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private int age;
    private float maxHeartRate;

    public HeartRates(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge() {
        LocalDateTime date = LocalDateTime.now();
        int currentYear = date.getYear();
        int currentMonth = date.getMonthValue();
        int currentDay = date.getDayOfMonth();

        if (monthOfBirth < currentMonth && yearOfBirth <= currentYear) {
            this.age = currentYear - yearOfBirth;
        } else if (currentYear > yearOfBirth && currentMonth == monthOfBirth && currentDay < dayOfBirth) {
            this.age = (currentYear - yearOfBirth) - 1;
        }
    }

    public int getAge() {
        return age;
    }

    public void setMaxHeartRate() {
        int CONSTANT = 220;
        this.maxHeartRate = (float) (CONSTANT - getAge());
    }

    public float getMaxHeartRate() {
        return maxHeartRate;
    }
}
