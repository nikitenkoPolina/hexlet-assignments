package exercise;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class AppTest {
    // BEGIN
    @Test
    void testTake1() {
        List<Integer> listTest1 = List.of(1, 2, 3, 4);
        int count1 = 4;
        assertEquals(4, App.take(listTest1, count1).size());
    }

    @Test
    void testTake2() {
        List<Integer> listTest2 = List.of(1, 2, 3, 4);
        int count2 = 3;
        assertEquals(3, App.take(listTest2, count2).size());
    }

    @Test
    void testTake3() {
        List<Integer> listTest3 = List.of(1, 2, 3, 4);
        int count3 = 0;
        assertEquals(0, App.take(listTest3, count3).size());
    }

    @Test
    void testTake4() {
        List<Integer> listTest4 = List.of();
        int count4 = 10;
        assertEquals(0, App.take(listTest4, count4).size());
    }

    @Test
    void testTake5() {
        List<Integer> listTest5 = List.of(1, 2, 3, 4);
        int count5 = 5;
        assertEquals(4, App.take(listTest5, count5).size());
    }

    @Test
    void testTake6() {
        List<Integer> listTest6 = List.of(1, 2, 3, 4);
        int count6 = 100;
        assertEquals(4, App.take(listTest6, count6).size());
    }
    // END
}
