package geoPoliticalZone;

public enum PoliticalZone {
    NORTH_CENTRAL("Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Plateau"),
    NORTH_EAST("Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"),
    NORTH_WEST("Kaduna","Kastina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SOUTH_EAST("Abia","Anambara","Ebonyi","Enugu","Imo"),
    SOUTH_SOUTH("Akwa-Ibom","Bayelsa","Cross-river","Delta","Edo","Rivers"),
    SOUTH_WEST("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo")
    ;

    private final String[] politicalZones;

    PoliticalZone(String... politicalZones){
        this.politicalZones = politicalZones;
    }

    public String[] getZone(){
        return politicalZones;
    }

}