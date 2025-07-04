package geoPoliticalZone;
import java.util.Scanner;

public class GeoPoliticalZone {
    private String politicalZone;
    private String state;
    private String checkState;

    public  void setPoliticalZone(String user) {
        PoliticalZone[] politicalZone = PoliticalZone.values();
        for (PoliticalZone zone : politicalZone) {
            for (int index = 0; index < zone.getZone().length; index++) {
                if ((zone.getZone()[index]).equalsIgnoreCase(user)) {
                    this.politicalZone = zone.toString();
                    this.state = zone.getZone()[index];
                }
            }
        }
    }

    public String getPoliticalZone() {
        return politicalZone;
    }

    public String getState() {
        return state;
    }


    public void main(String... args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter state: ");
        String state = sc.nextLine();

        setPoliticalZone(state);

        System.out.printf("%s is in %s geo-political zone", getState(), getPoliticalZone());
    }
}
