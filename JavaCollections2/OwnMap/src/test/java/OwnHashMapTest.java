import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;


class OwnHashMapTest {

    OwnHashMap testOwnHashMap = new OwnHashMap();

    public OwnHashMapTest() {
        this.testHashMap = new ArrayList<Node>();
    }

//    public void createTestMap() {
//        this.testOwnHashMap = new OwnHashMap();
//        Node testTemp;
//    }
    class Node {

        String key;
        String value;

        public void insert(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private Node testTemp;
   // private List<Node> testHashMap;

    List<Node> testHashMap = Mockito.mock(ArrayList.class);
    testHashMap.add("one");


    @Test
    void shouldReturnTrueIfKeyValueAddedToTheList(String testKey, String testValue) {
        //given
        testKey = "1";
        testValue = "2";
        //when
        boolean testAddResult = testOwnHashMap.put(testKey, testValue);
        //then
        Assertions.assertEquals(true, testAddResult);
    }

    @Test
    void shouldReturnTrueIfMapContainsKey(String testKey) {
        //given
        testKey = "testKey";
        //when
        boolean testContainsKey = testOwnHashMap.containsKey(testKey);
        //then
        Assertions.assertEquals(false, testContainsKey);
    }

    @Test
    void shouldReturnTrueIfMapContainsValue(String testValue) {
        //given
        testValue = "testValue";
        //when
        boolean testContainsValue = testOwnHashMap.containsValue(testValue);
        //then
        Assertions.assertEquals(false, testContainsValue);
    }

    @Test
    void shouldReturnValueOfRemovedKey(String testKey) {
        //given
        testKey = "testKey";
        //when
        String testRemoveValue = testOwnHashMap.remove(testKey);
        //then
        Assertions.assertEquals("testValue", testRemoveValue);
    }

    @Test
    void shouldReturnValueOfProvidedKey(String testKey) {
        //given
        testKey = "testKey";
        //when
        String testGetValue = testOwnHashMap.get(testKey);
        //then
        Assertions.assertEquals("testValue", testGetValue);
    }
}