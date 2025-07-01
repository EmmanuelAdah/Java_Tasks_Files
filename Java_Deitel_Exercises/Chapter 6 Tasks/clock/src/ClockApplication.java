public class ClockApplication {
    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        Clock clock = new Clock();

        System.out.print("Enter hour: ");
        int hour = 0;
        try {
            hour = input.nextInt();
            clock.setHour(hour);
        }catch (Exception e){
            System.out.println("Invalid input");
        }
        System.out.print("Enter minute: ");
        int minutes = 0;
        try {
            minutes = input.nextInt();
            clock.setMinutes(minutes);
        }catch (Exception e){
            System.out.println("Invalid input");
        }
        System.out.print("Enter second: ");
        int seconds = 0;
        try {
            seconds = input.nextInt();
            clock.setSeconds(seconds);
        } catch (Exception e){
            System.out.println("Invalid input");
        }
        System.out.printf("%02d:%02d:%02d", clock.getHour(), clock.getMinutes(), clock.getSeconds());
    }
}
