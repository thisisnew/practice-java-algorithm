package leetcode;

import java.util.Map;
import java.util.TreeMap;

public class TimeMap {

    private final Map<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        this.map = new TreeMap<>();
    }

    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> timeStampMap = map.getOrDefault(key, new TreeMap<>());
        timeStampMap.put(timestamp, value);
        map.put(key, timeStampMap);
    }

    public String get(String key, int timestamp) {
        TreeMap<Integer, String> timeStampMap = map.get(key);

        if (timeStampMap == null) {
            return "";
        }

        Map.Entry<Integer, String> entry = timeStampMap.floorEntry(timestamp);

        if (entry == null) {
            return "";
        }

        return entry.getValue();
    }
}
