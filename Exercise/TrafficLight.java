public enum TrafficLight {
    RED{
        TrafficLight next(){ return GREEN; }
    },
    GREEN{
        TrafficLight next(){ return YELLOW; }
    },
    YELLOW{
        TrafficLight next(){ return BLUE; }
    },
    BLUE{
        TrafficLight next(){ return RED; }
    };

    abstract TrafficLight next();
}
