package geoPoliticalZone;

public class GeoPoliticalZone {
    private String politicalZone;
    private String state;

    public  void setPoliticalZone(String state) {
        PoliticalZone[] politicalZone = PoliticalZone.values();
        for (PoliticalZone zone : politicalZone) {
            for (int index = 0; index < zone.getZone().length; index++) {
                if ((zone.getZone()[index]).equalsIgnoreCase(state)) {
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