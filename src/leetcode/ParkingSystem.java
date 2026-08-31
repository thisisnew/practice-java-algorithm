package leetcode;

import java.util.HashMap;
import java.util.Map;

public class ParkingSystem {

    private final Map<Integer, Integer> slot;

    public static void main(String[] args) {
        ParkingSystem parkingSystem = new ParkingSystem(1,1,0);
    }

    ParkingSystem(int big, int medium, int small) {
        this.slot = new HashMap<>();
        this.slot.put(1, big);
        this.slot.put(2, medium);
        this.slot.put(3, small);
    }

    private boolean addCar(int carType) {
        int count = this.slot.get(carType);

        this.slot.put(carType, count - 1);
        return count > 0;
    }
}
