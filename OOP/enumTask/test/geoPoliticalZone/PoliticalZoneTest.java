package geoPoliticalZone;

import org.junit.jupiter.api.Test;

public class PoliticalZoneTest {
    PoliticalZone[] zones = PoliticalZone.values();

    @Test
    public void itemIsSameTest(){

    for(PoliticalZone zone : zones){
        for(int index = 0; index < zone.getZone().length; index++){
            if((zone.getZone()[index]).equalsIgnoreCase("kano")){
                System.out.printf("%s belongs to %s geo-political zone", (zone.getZone()[index]), zone);
            }
        }
    }
    }
}