package org.example.challenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LRUCacheTest {

    LRUCache testInstance;

    @Test
    void testCache(){
        testInstance = new LRUCache(2);
        Assertions.assertNull(testInstance.getValue("key1"));
        Assertions.assertNull(testInstance.getValue("key2"));
        testInstance.putValue("key1","value1");
        testInstance.putValue("key2","value2");
        Assertions.assertEquals("value1", testInstance.getValue("key1"));
        Assertions.assertEquals("value2", testInstance.getValue("key2"));
        testInstance.putValue("key3","value3");
        Assertions.assertNull(testInstance.getValue("key1"));
        testInstance.putValue("key1","value1");
        testInstance.putValue("key3","valueNew");
        Assertions.assertNull(testInstance.getValue("key2"));
        Assertions.assertEquals("valueNew", testInstance.getValue("key3"));
        Assertions.assertEquals("value1", testInstance.getValue("key1"));
    }



}
