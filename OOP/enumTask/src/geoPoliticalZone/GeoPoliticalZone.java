package geoPoliticalZone;

public class GeoPoliticalZone {
    private String politicalZone;
    private String state;

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
        return this.politicalZone;
    }

    public String getState() {
        return this.state;
    }
}
