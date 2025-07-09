public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24) {
            this.hour = hour;
        }
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        }
        if (second >= 0 && second < 60) {
            this.second = second;
        }
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinutes(int minute) {
        this.minute = minute;
    }

    public int getMinutes() {
        return minute;
    }

    public void setSeconds(int second) {
        this.second = second;
    }

    public int getSeconds() {
        return second;
    }

    public String displayTime(){
       return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
