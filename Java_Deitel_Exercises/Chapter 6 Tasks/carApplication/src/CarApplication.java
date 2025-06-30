import java.util.Scanner;

public class CarApplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Car car = new Car();

        System.out.print("Enter car model: ");
        String model = input.nextLine();
        car.setCarModel(model);

        System.out.print("Enter car production year: ");
        String year = input.nextLine();
        car.setCarYear(year);

        System.out.print("Enter car price: ");
        double price = input.nextDouble();
        car.setCarPrice(price);

        System.out.printf("Car model: %s%nCar year: %s%n", car.getCarModel(), car.getCarYear());
        car.discountAt_5_Percent(price);
        System.out.printf("Car price at 5%% discount: %.2f%n", car.getCarPrice());
        car.discountAt_7_Percent(price);
        System.out.printf("Car price at 7%% discount: %.2f%n", car.getCarPrice());
    }
}
