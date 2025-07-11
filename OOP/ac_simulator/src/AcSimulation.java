public class AcSimulation {
    private boolean status;
    private int temperature = 16;

    public void setAcState(String state) {
        this.status = state.equalsIgnoreCase("on");
    }

    public boolean getAcStatus() {
        return status;
    }

    public void setTemperature(int user_input) {
        int currentTemp = user_input + temperature;
        if (currentTemp >= 16 && currentTemp <= 30) this.temperature += user_input;
    }

    public int getTemperature() {
        return temperature;
    }
}