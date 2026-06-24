package leetcode;

import java.util.TreeMap;

public class StockPrice {

    private final TreeMap<Integer, Integer> timestampPriceMap;
    private final TreeMap<Integer, Integer> priceCountMap;

    public StockPrice() {
        this.timestampPriceMap = new TreeMap<>();
        this.priceCountMap = new TreeMap<>();
    }

    public void update(int timestamp, int price) {

        Integer oldPrice = timestampPriceMap.get(timestamp);

        if (oldPrice != null) {
            int count = priceCountMap.getOrDefault(oldPrice, 0) - 1;

            if (count <= 0) {
                priceCountMap.remove(oldPrice);
            } else {
                priceCountMap.put(oldPrice, count);
            }
        }

        timestampPriceMap.put(timestamp, price);
        priceCountMap.put(price, priceCountMap.getOrDefault(price, 0) + 1);
    }

    public int current() {
        Integer last = timestampPriceMap.lastKey();

        if (last == null) {
            return 0;
        }

        return timestampPriceMap.get(last);
    }

    public int maximum() {
        Integer last = priceCountMap.lastKey();
        if (last == null) {
            return 0;
        }

        return last;
    }

    public int minimum() {
        Integer first = priceCountMap.firstKey();
        if (first == null) {
            return 0;
        }

        return first;
    }
}
