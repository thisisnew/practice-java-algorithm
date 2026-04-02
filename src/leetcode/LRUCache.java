package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LRUCache {

    private final int capacity;
    private final Map<Integer, CacheNode> cache = new HashMap<>();
    private final CacheNode head = new CacheNode(0, 0);
    private final CacheNode tail = new CacheNode(0, 0);

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        CacheNode cacheNode = cache.get(key);

        if (Objects.isNull(cacheNode)) {
            return -1;
        }

        moveToHead(cacheNode);
        return cacheNode.value;
    }

    public void put(int key, int value) {
        var cacheNode = cache.get(key);

        if (cacheNode != null) {
            cacheNode.value = value;
            moveToHead(cacheNode);
            return;
        }

        var newCache = new CacheNode(key, value);
        cache.put(key, newCache);
        moveToFirst(newCache);

        if (cache.size() > capacity) {
            var last = lastCache();
            cache.remove(last.key);
            remove(last);
        }
    }

    private void moveToHead(CacheNode cacheNode) {
        remove(cacheNode);
        moveToFirst(cacheNode);
    }

    private void remove(CacheNode cacheNode) {
        cacheNode.prev.next = cacheNode.next;
        cacheNode.next.prev = cacheNode.prev;
    }

    private void moveToFirst(CacheNode cacheNode) {
        head.next = cacheNode.next;
        cacheNode.prev = head;

        head.next.prev = cacheNode;
        head.next = cacheNode;
    }

    private CacheNode lastCache() {
        return tail.prev;
    }

    private static class CacheNode {
        int key;
        int value;
        CacheNode prev;
        CacheNode next;

        public CacheNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
