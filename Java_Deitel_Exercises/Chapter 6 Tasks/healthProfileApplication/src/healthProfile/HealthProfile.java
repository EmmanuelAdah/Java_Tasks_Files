package healthProfile;
import heartRates.HeartRates;

public class HealthProfile extends HeartRates {
    private double height;
    private double weight;
    private float bmi;
    private String targetHeartRange;

    public HealthProfile(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth, double height, double weight) {
        super(firstName, lastName, dayOfBirth, monthOfBirth, yearOfBirth);
        this.weight = weight;
        this.height = height;
    }

    public void setBmi(double height, double weight) {
        int CONSTANT = 703;
        this.bmi = (float)(CONSTANT * (weight / (height * height)));
    }

    public float getBmi() {
        return bmi;
    }

    public void setTargetHeartRate() {
        float minTargetHeartRate = getMaxHeartRate() * 0.65f;
        float maxTargetHeartRate = getMaxHeartRate() * 0.85f;
        targetHeartRange = String.format("%.1f - %.1f",minTargetHeartRate, maxTargetHeartRate);
    }

    public String getTagetHeartRange() {
        return targetHeartRange;
    }
}
