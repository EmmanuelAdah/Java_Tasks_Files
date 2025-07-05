public class AutomaticBike {
    private boolean status;
    private int gear;
    private int speed;

    public boolean getStatus() {
        return status;
    }

    public void setStatus(String bikeEngine) {
        if(bikeEngine.equalsIgnoreCase("on")) status = true;
    }

    public int getGear() {
        return gear;
    }

    public void setAcceleration() {
        this.speed += (speed + gear);
    }

    public void setSpeed(int speed1) {
        this.speed = speed1;
    }

    public void setGear() {
        if (speed > 0 && speed <= 20){
            gear = 1;
        } else if (speed > 20 && speed <= 30){
            gear = 2;
        } else if (speed > 30 &&  speed <= 40){
            gear = 3;
        } else if (speed > 40){
            gear = 4;
        }
    }

    public int getSpeed() {
        return speed;
    }
}