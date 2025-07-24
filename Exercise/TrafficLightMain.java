public class EnumPractice {
    public static void main(String[] args) {

        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light.next());
        }
    }
}
