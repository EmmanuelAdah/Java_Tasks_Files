public class Clock {
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        }
    }

    public int getHour() {
        return hour;
    }
}
