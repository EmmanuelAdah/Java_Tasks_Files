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

    public void setMinutes(int minute) {
        if (minute >= 0 && minute < 60) {
            this.minute = minute;
        }
    }

    public int getMinutes() {
        return minute;
    }

    public void setSeconds(int second) {
        if (second >= 0 && second < 60) {
            this.second = second;
        }
    }

    public int getSeconds() {
        return second;
    }

    public String displayTime(){
       return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
