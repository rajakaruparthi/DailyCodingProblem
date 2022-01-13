package com.daily.coding;

/*
This problem was asked by Google.

Implement an LFU (Least Frequently Used) cache. It should be able to be initialized with a cache size n, and contain the following methods:

set(key, value): sets key to value. If there are already n items in the cache and we are adding a new item, then it should also remove the least frequently used item.

If there is a tie, then the least recently used key should be removed.

get(key): gets the value at key. If no such key exists, return null.

Each operation should run in O(1) time.

 */

import java.time.Instant;
import java.util.*;

public class Problem67 {

    private int n = 10;

    private int count;

    HashMap<String, List<Long>> cacheMap = new HashMap<>();

    private void set(String key) {
        if (isFull()) {
            replaceValue(key);
        } else {
            this.count++;
            List<Long> list = new ArrayList<>();
            list.add(getDate());
            cacheMap.put(key, list);
        }
    }

    private void replaceValue(String value) {
        String leastCachedKey = "";

        int min = 0;
        for (String key : cacheMap.keySet()) {
            List<Long> dateList = cacheMap.get(key);
            int size = dateList.size();
            if (size < min) {
                min = size;
                leastCachedKey = key;
            }
        }
        cacheMap.remove(leastCachedKey);
        cacheMap.put(value, new ArrayList<>(Arrays.asList(getDate())));
    }

    private String getKey(String key) {
        boolean flag = cacheMap.containsKey(key);
        if (flag) {
            List<Long> dates = cacheMap.get(key);
            dates.add(getDate());
            cacheMap.put(key, dates);
            return key;
        }
        return null;
    }

    private boolean isFull() {
        if (count == n) {
            return true;
        }
        return false;
    }

    private long getDate() {
        long now = Instant.now().toEpochMilli();
        return now;
    }

    public static void main(String[] args) {
        Problem67 p = new Problem67();
        p.set("key");
        p.set("key1");
        p.set("key2");
        p.set("key3");
        p.set("key4");
        p.set("key5");
        p.set("key6");
        p.set("key7");
        p.set("key8");
        p.set("key9");

        p.getKey("key3");
        p.getKey("key4");
        p.getKey("key5");
        p.getKey("key6");
        p.getKey("key7");
        p.getKey("key10");

        p.getKey("key4");
        p.getKey("key5");
        p.getKey("key6");

        System.out.println(p.cacheMap);

    }
}
