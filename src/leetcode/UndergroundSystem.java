package leetcode;

import java.util.HashMap;
import java.util.Map;

public class UndergroundSystem {

    private final Map<String, Station> checkInStation;
    private final Map<String, Station> checkOutStation;

    public UndergroundSystem() {
        this.checkInStation = new HashMap<>();
        this.checkOutStation = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        Station station = new Station(id, stationName, t);
        checkInStation.put(stationName, station);
    }

    public void checkOut(int id, String stationName, int t) {
        Station station = new Station(id, stationName, t);
        checkOutStation.put(stationName, station);
    }

    public double getAverageTime(String startStation, String endStation) {

    }

}

class Station {

    private final int id;
    private final String stationName;
    private final int time;

    Station(int id, String stationName, int time) {
        this.id = id;
        this.stationName = stationName;
        this.time = time;
    }
}
