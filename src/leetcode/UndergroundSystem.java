package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndergroundSystem {

    private final Map<Integer, Station> checkInStation;
    private final Map<String, TravelTime> travelTime;

    public UndergroundSystem() {
        this.checkInStation = new HashMap<>();
        this.travelTime = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        Station station = new Station(stationName, t);
        checkInStation.put(id, station);
    }

    public void checkOut(int id, String stationName, int t) {
        var checkInStation = this.checkInStation.get(id);
        if (checkInStation == null) {
            return;
        }

        String startStation = checkInStation.stationName();
        String travelStation = startStation + "-" + stationName;
        TravelTime travelTime = this.travelTime.getOrDefault(travelStation, new TravelTime(new ArrayList<>()));
        travelTime.addTime(t - checkInStation.time());
        this.travelTime.put(travelStation, travelTime);
    }

    public double getAverageTime(String startStation, String endStation) {
        String travelStation = startStation + "-" + endStation;
        TravelTime travelTime = this.travelTime.getOrDefault(travelStation, new TravelTime(new ArrayList<>()));
        return travelTime.averageTime();
    }

}

class Station {

    private final String stationName;
    private final int time;

    Station(String stationName, int time) {
        this.stationName = stationName;
        this.time = time;
    }

    public String stationName() {
        return stationName;
    }

    public int time() {
        return time;
    }
}

class TravelTime {
    private final List<Integer> times;

    TravelTime(List<Integer> times) {
        this.times = times;
    }

    public void addTime(int time) {
        this.times.add(time);
    }

    public double averageTime() {
        return times.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }
}