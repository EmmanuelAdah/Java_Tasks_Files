public class ClockApplication {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter hour: ");
        int hour = 0;
        try {
            hour = input.nextInt();
        }catch (Exception e){
            System.out.println("Invalid input");
        }

        System.out.print("Enter minute: ");
        int minutes = 0;
        try {
            minutes = input.nextInt();
        }catch (Exception e){
            System.out.println("Invalid input");
        }

        System.out.print("Enter second: ");
        int seconds = 0;
        try {
            seconds = input.nextInt();
        } catch (Exception e){
            System.out.println("Invalid input");
        }
        Clock clock = new Clock(hour, minutes, seconds);
        System.out.printf("The set time is %s", clock.displayTime());
    }
}