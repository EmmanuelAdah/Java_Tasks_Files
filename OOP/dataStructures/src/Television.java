public class Television {
    private boolean isOn;
    private String toggle;


    public boolean getIsOn() {
        return isOn;
    }

    public void setToggle(String toggle) {
        isOn = (!isOn);
    }
}
