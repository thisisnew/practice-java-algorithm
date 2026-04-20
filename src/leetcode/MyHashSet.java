package leetcode;

import java.util.Arrays;

public class MyHashSet {

    private final int[] array;

    public MyHashSet() {
        this.array = new int[1000001];
        Arrays.fill(array, -1);
    }

    public void add(int key) {
        array[key] = key;
    }

    public void remove(int key) {
        array[key] = -1;
    }

    public boolean contains(int key) {
        return array[key] != -1;
    }

}
