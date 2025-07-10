package healthProfile;
import heartRates.HeartRates;

public class HealthProfile extends HeartRates {
    private final double height;
    private final double weight;
    private float bmi;
    private float maxiHeartRate;
    private String targetHeartRange;

    public HealthProfile(String firstName, String lastName, int birthDay, int birthMonth, int birthYear, double height, double weight) {
        super(firstName, lastName, birthDay, birthMonth, birthYear);
        this.height = height;
        this.weight = weight;
    }

    public void setBmi(double height, double weight) {
        int CONSTANT = 703;
        this.bmi = (float)(CONSTANT * (weight / (height * height)));
    }

    public float getBmi() {
        return bmi;
    }

    public float getMaxHeartRate() {
        return maxiHeartRate;
    }

    public void setTargetHeartRate(float maxHeartRate) {
        float targetHeartRateZone1 = getMaxHeartRate() * 0.65f;
        float targetHeartRateZone2 = getMaxHeartRate() * 0.85f;
        targetHeartRange = String.format("%.1f - %.1f",targetHeartRateZone1, targetHeartRateZone2);
    }

    public String getTagetHeartRange() {
        return targetHeartRange;
    }
}
