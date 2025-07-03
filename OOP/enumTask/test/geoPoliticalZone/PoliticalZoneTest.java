package geoPoliticalZone;

import geoPoliticalZone.PoliticalZone;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PoliticalZoneTest {
    PoliticalZone[] zones = PoliticalZone.values();

    @Test
    public void itemIsSameTest(){

    for(PoliticalZone zone : zones){
        for(int index = 0; index < zone.getZones().length; index++){
            if((zone.getZones()[index]).equalsIgnoreCase("borno")){
                System.out.printf("%s belongs to %s geo-political zone", (zone.getZones()[index]), zone);
            }
        }
    }
    }
}