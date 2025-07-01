public class AcSimulation {
    private boolean status;
    private String state;
    private int temperature;

    public void setAcState(String state) {
        this.status = state.equalsIgnoreCase("on");
    }

    public boolean getAcStatus() {
        return status;
    }

    public void setTemperature(int temperature) {
        this.temperature += temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
