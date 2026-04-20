package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UndergroundSystem {

    private final Map<Integer, Station> checkInStationMap;
    private final Map<String, List<Integer>> fromToEndTimeMap;
    private static final String STR_DASH = "-";

    public UndergroundSystem() {
        this.checkInStationMap = new HashMap<>();
        this.fromToEndTimeMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        Station checkInStation = new Station(stationName, t);
        checkInStationMap.put(id, checkInStation);
    }

    public void checkOut(int id, String stationName, int t) {
        Station checkInStation = checkInStationMap.get(id);
        if (checkInStation == null) return;

        String key = checkInStation.name() + STR_DASH + stationName;
        int duration = t - checkInStation.time();

        List<Integer> fromToEndTimes = fromToEndTimeMap.getOrDefault(key, new ArrayList<>());
        fromToEndTimes.add(duration);

        fromToEndTimeMap.put(key, fromToEndTimes);
    }

    public double getAverageTime(String startStation, String endStation) {

        String key = startStation + STR_DASH + endStation;
        List<Integer> fromToEndTimes = fromToEndTimeMap.getOrDefault(key, new ArrayList<>());

        return fromToEndTimes.stream()
                .mapToInt(value -> {
                    return value;
                })
                .average()
                .orElse(0.0);
    }

    private static class Station {
        private final String name;
        private final int time;

        public Station(String name, int time) {
            this.name = name;
            this.time = time;
        }

        public String name() {
            return name;
        }

        public int time() {
            return time;
        }
    }

}