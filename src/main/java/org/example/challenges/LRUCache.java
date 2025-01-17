package org.example.challenges;

/*
LRU cache (least recently used cache) is a cache of fixed capacity.
It has 2 methods i) Get value from a key ii) Put key-value in the cache
Upon any operation the recently used node if kept at the beginning of the cache
and any excess node if removed from the cache
 */

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LRUCache {

    private final int capacity;
    private final Map<String, String> cache = new HashMap<String,String>();
    private final List<String> cacheList = new LinkedList<String>();

    public LRUCache(int capacity){
        this.capacity = capacity;
    }

    public String getValue(String key) {
        removeFromLastAndAddAtBeginning(key);
        return cache.get(key);
    }

    private void removeFromLastAndAddAtBeginning(String key) {
        if(cacheList.contains(key)) {
            cacheList.removeLast();
            cacheList.addFirst(key);
        }
    }

    /*
    * before inserting the value in hashmap check if the capacity is full
    * if capacity is not reached: insert value in hashmap & add the element in 1st position in linked list
    * if capacity has reached: find the last element in linked list , remove from hashmap & linkedlist , insert value in hashmap & add the element in 1st position in linked list
    * */
    public void putValue(String key, String value) {
        if(cache.containsKey(key)){
            removeFromLastAndAddAtBeginning(key);
            cache.put(key,value);
        }else {
            if(cache.size() >= capacity ){
                String lastKey = cacheList.getLast();
                cache.remove(lastKey);
            }
            cache.put(key,value);
            cacheList.addFirst(key);
        }
    }
}
