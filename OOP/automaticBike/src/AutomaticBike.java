public class AutomaticBike {
    private boolean status;
    private String bikeEngine;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(String bikeEngine) {
        if (bikeEngine.equalsIgnoreCase("on")) status = true;
    }
}
