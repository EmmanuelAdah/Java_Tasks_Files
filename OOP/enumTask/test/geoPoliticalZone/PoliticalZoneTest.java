package geoPoliticalZone;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PoliticalZoneTest {

    GeoPoliticalZone geoZone = new GeoPoliticalZone();

    @Test
    public void itemIsSameTest(){
        geoZone.setPoliticalZone("Benue");
    assertEquals("NORTH_CENTRAL", geoZone.getPoliticalZone());
    }
}