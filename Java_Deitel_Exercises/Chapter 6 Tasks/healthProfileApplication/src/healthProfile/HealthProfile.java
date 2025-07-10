package healthProfile;
import java.time.LocalDateTime;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private double height;
    private double weight;
    private float bmi;
    private int age;
    private float maxiHeartRate;

    public int getAge() {
        return age;
    }

    public void setAge(int birthDay, int birthMonth, int birthYear) {
        LocalDateTime date = LocalDateTime.now();
        int currentYear = date.getYear();
        int currentMonth = date.getMonthValue();
        int currentDay = date.getDayOfMonth();

        if (birthMonth < currentMonth && birthYear <= currentYear) {
            this.age = currentYear - birthYear;
        } else if (currentYear > birthYear && currentMonth == birthMonth && currentDay < birthDay) {
            this.age = (currentYear - birthYear) - 1;
        }
    }

    public void setBmi(double height, double weight) {
        int CONSTANT = 703;
        this.bmi = (float)(CONSTANT * (weight / (height * height)));
    }

    public float getBmi() {
        return bmi;
    }

    public void setMaxHeartRate(int age) {
        int CONSTANT = 207;
        float maximumHeartRate = CONSTANT - (float)(age * 0.7);
        this.maxiHeartRate = (int)maximumHeartRate;
    }

    public float getMaxHeartRate() {
        return maxiHeartRate;
    }

    public void setTargetHeartRate(float maxHeartRate) {
        int PERCENTAGE = 100;
         float targetHeartRateZone = getMaxHeartRate() * 0.65f;

    }
}
