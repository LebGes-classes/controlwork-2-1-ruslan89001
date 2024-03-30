import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyArrayListTest {
    private MyArrayList<Integer> myList;

    @BeforeEach
    void setUp() {
        myList = new MyArrayList<>();
    }

    @Test
    void testAddAndGet() {
        myList.add(10);
        myList.add(20);
        myList.add(30);

        assertEquals(10, myList.get(0));
        assertEquals(20, myList.get(1));
        assertEquals(30, myList.get(2));
    }

    @Test
    void testRemove() {
        myList.add(10);
        myList.add(20);
        myList.add(30);

        myList.remove(1);

        assertEquals(10, myList.get(0));
        assertEquals(30, myList.get(1));
        assertEquals(2, myList.size());
    }

    @Test
    void testOutOfBounds() {
        assertThrows(IndexOutOfBoundsException.class, () -> myList.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> myList.remove(0));
    }

    @Test
    void testSize() {
        assertEquals(0, myList.size());

        myList.add(10);
        myList.add(20);

        assertEquals(2, myList.size());
    }
}