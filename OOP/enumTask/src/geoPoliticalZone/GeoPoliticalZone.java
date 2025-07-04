package geoPoliticalZone;

public class GeoPoliticalZone {
    private String politicalZone;

    public void setPoliticalZone(String state){
        PoliticalZone[] zones = PoliticalZone.values();
        for(PoliticalZone zone : zones){
            for(int index = 0; index < zone.getZone().length; index++){
                if ((zone.getZone()[index]).equalsIgnoreCase(state)) {
                    this.politicalZone = zone.toString(); break;
                }
            }
        }
    }

    public String getPoliticalZone() {
        return politicalZone;
    }
}
