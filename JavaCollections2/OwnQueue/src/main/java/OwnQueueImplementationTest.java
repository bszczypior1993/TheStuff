import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnQueueImplementationTest {

    //given

    @Test
    void shouldAddElementToQueue() {
        //given
        OwnQueueImplementation myTestQueue = new OwnQueueImplementation();
        //when
        myTestQueue.add(2);
        myTestQueue.add(5);
        myTestQueue.add(1);
        //then
        Assertions.assertEquals(3, myTestQueue.length);
    }

    @Test
    void remove() {
        //given
        OwnQueueImplementation myTestQueue = new OwnQueueImplementation();
        myTestQueue.add(2);
        myTestQueue.add(5);
        myTestQueue.add(1);
        //when
        int testRemovedValue = myTestQueue.remove();
        //then
        Assertions.assertEquals(2, testRemovedValue);
    }
}