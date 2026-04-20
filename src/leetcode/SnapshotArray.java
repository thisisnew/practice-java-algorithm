package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SnapshotArray {

    private final int[] array;
    private final Map<Integer, int[]> snapshots;
    private final int length;
    private int snapId = 0;

    public SnapshotArray(int length) {
        this.length = length;
        this.array = new int[this.length];
        Arrays.fill(array, 0);
        this.snapshots = new HashMap<>();
    }

    public void set(int index, int val) {
        array[index] = val;
    }

    public int snap() {
        snapshots.put(snapId, array.clone());
        return snapId++;
    }

    public int get(int index, int snap_id) {
        int[] array = snapshots.getOrDefault(snap_id, new int[this.length]);
        return array[index];
    }

}
