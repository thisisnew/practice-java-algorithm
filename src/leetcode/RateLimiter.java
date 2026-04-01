package leetcode;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class RateLimiter {

    private static final Map<String, Integer> WORKTIME_STAMPS = new HashMap<>();

    public static void main(String[] args) throws IOException {
        System.out.println(shouldPrintMessage(1, "foo"));
    }

    private static boolean shouldPrintMessage(int timestamp, String message) {
        if (WORKTIME_STAMPS.containsKey(message)) {
            var lastTimestamp = WORKTIME_STAMPS.get(message);

            if (timestamp < lastTimestamp) {
                return false;
            }
        }

        WORKTIME_STAMPS.put(message, timestamp + 10);
        return true;
    }
}
