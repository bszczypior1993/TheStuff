//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//class OwnHashMapTest {
//
//
//    @Test
//    void shouldReturnAmountOfValuesInTheList() {
//        //given
//        OwnHashMap testOwnHashMap = new OwnHashMap();
//        testOwnHashMap.put("1", "Basia");
//        testOwnHashMap.put("2", "Cebula");
//        testOwnHashMap.put("3", "Szczypior");
//        //when
//        int testHashMapSize = testOwnHashMap.length;
//        //then
//        Assertions.assertEquals(3, testHashMapSize);
//    }
//
//    @Test
//    void shouldReturnTrueIfMapContainsKey() {
//        //given
//        OwnHashMap testOwnHashMap = new OwnHashMap();
//        testOwnHashMap.put("1", "Basia");
//        testOwnHashMap.put("2", "Cebula");
//        testOwnHashMap.put("3", "Szczypior");
//        String testKey = "2";
//        //when
//        boolean testContainsKey = testOwnHashMap.containsKey(testKey);
//        //then
//        Assertions.assertEquals(true, testContainsKey);
//    }
//
//    @Test
//    void shouldReturnTrueIfMapContainsValue() {
//        //given
//        OwnHashMap testOwnHashMap = new OwnHashMap();
//        testOwnHashMap.put("1", "Basia");
//        testOwnHashMap.put("2", "Cebula");
//        testOwnHashMap.put("3", "Szczypior");
//        String testValue = "Cebula";
//        //when
//        boolean testContainsValue = testOwnHashMap.containsValue(testValue);
//        //then
//        Assertions.assertEquals(true, testContainsValue);
//    }
//
//    @Test
//    void shouldReturnValueOfRemovedKeyAndAmountOfElementsInTheMap() {
//        //given
//        OwnHashMap testOwnHashMap = new OwnHashMap();
//        testOwnHashMap.put("1", "Basia");
//        testOwnHashMap.put("2", "Cebula");
//        testOwnHashMap.put("3", "Szczypior");
//        String testKey = "1";
//        //when
//        String testRemoveValue = testOwnHashMap.remove(testKey);
//        int testMapLength = testOwnHashMap.length;
//        //then
//        Assertions.assertEquals("Basia", testRemoveValue);
//        Assertions.assertEquals(2, testMapLength);
//    }
//
//    @Test
//    void shouldReturnValueOfProvidedKey() {
//        //given
//        OwnHashMap testOwnHashMap = new OwnHashMap();
//        testOwnHashMap.put("1", "Basia");
//        testOwnHashMap.put("2", "Cebula");
//        testOwnHashMap.put("3", "Szczypior");
//        String testKey = "1";
//        //when
//        String testGetValue = testOwnHashMap.get(testKey);
//        //then
//        Assertions.assertEquals("Basia", testGetValue);
//    }
//}