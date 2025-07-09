public class ClockApplication {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        Clock clock = new Clock();

        System.out.print("Enter hour: ");
        try {
            int hour = input.nextInt();
            clock.setHour(hour);
        }catch (Exception e){
            System.out.println("Invalid input");
        }

        System.out.print("Enter minute: ");
        try {
            int minutes = input.nextInt();
            clock.setMinutes(minutes);
        }catch (Exception e){
            System.out.println("Invalid input");
        }

        System.out.print("Enter second: ");
        try {
            int seconds = input.nextInt();
            clock.setSeconds(seconds);
        } catch (Exception e){
            System.out.println("Invalid input");
        }
        System.out.printf("The set time is %s", clock.displayTime());
    }
}