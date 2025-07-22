package geoPoliticalZone;

import java.util.Scanner;

public class PoliticalZoneMain {
    public static void main(String... args) {
        GeoPoliticalZone zone = new GeoPoliticalZone();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter state: ");
        String state = sc.nextLine();

        zone.setPoliticalZone(state);

        System.out.printf("%s is in %s geo-political zone", zone.getState(), zone.getPoliticalZone());
    }
}
