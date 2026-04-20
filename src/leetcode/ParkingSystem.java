package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ParkingSystem {

    private final Map<Integer, Integer> carMap;

    public ParkingSystem(int big, int medium, int small) {
        this.carMap = new HashMap<>();
        carMap.put(1, big);
        carMap.put(2, medium);
        carMap.put(3, small);
    }

    public boolean addCar(int carType) {

        int count = carMap.get(carType);

        if (count == 0) {
            return false;
        }

        carMap.put(carType, count - 1);
        return true;
    }
}
