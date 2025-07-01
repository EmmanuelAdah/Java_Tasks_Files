public class Car {
    private String model;
    private String year;
    private double price;

    public void setCarModel(String model) {
        this.model = model.toUpperCase();
    }

    public String getCarModel() {
        return model;
    }

    public void setCarYear(String year) {
        int yearValue = Integer.parseInt(year);
        if (yearValue > 1967 && yearValue <= 2026) {
            this.year = year;
        }
    }

    public String getCarYear() {
        return year;
    }

    public void setCarPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public double getCarPrice() {
        return price;
    }

    public void discountAt_5_Percent(double price) {
        double PERCENTAGE = 100;
        double discount = (5 / PERCENTAGE) * price;
        this.price = price - discount;
    }

    public void discountAt_7_Percent(double price) {
        double PERCENTAGE = 100;
        double discount = (7 / PERCENTAGE) * price;
        this.price = price - discount;
    }
}
