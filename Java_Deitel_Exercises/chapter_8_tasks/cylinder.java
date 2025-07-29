package chapter_8_tasks;

public class cylinder {
    private double radius;
    private double height;

    public cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double volumeOfCylinder(double radius, double height){
        double volume = ((double) 22 / 7) * radius * height;
        return volume;
    }
}
