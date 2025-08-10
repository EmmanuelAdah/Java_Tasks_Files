package geoPoliticalZone;

import javax.swing.*;
import java.util.Scanner;

public class PoliticalZoneMain {
    public static void main(String... args) {
        GeoPoliticalZone zone = new GeoPoliticalZone();
        Scanner sc = new Scanner(System.in);

        String state = JOptionPane.showInputDialog("Enter state: ");
        zone.setPoliticalZone(state);

        JOptionPane.showMessageDialog(null,
                String.format("%s is in %s geo-political zone", zone.getState(), zone.getPoliticalZone()));
    }
}
