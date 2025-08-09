package chapter_8_tasks;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        if (radius <= 0) throw new IllegalArgumentException("Radius must be greater than zero.");
        this.radius = radius;
        if (height <= 0) throw new IllegalArgumentException("Height must be greater than zero.");
        this.height = height;
    }

    public void setRadius(double radius) {
        if (radius <= 0) throw new IllegalArgumentException("Radius must be greater than zero.");
        this.radius = radius;
    }

    public void setHeight(double height) {
        if (height <= 0) throw new IllegalArgumentException("Height must be greater than zero.");
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public String volumeOfCylinder(double radius, double height){
        return String.format("%.2f",Math.PI * radius * height);
    }


}
