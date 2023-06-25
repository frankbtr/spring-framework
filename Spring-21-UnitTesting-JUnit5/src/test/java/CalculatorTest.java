import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testCase1(){
        fail("Not implemented yet");
    }

    @Test
    void testCase2(){
        assertTrue(Calculator.operator.equals("add"));
        assertEquals("add", Calculator.operator);
    }

    @Test
    void testCase3(){
        assertArrayEquals(new int[]{1,2,3}, new int[] {1,2,3});
    }

    @Test
    void testCase4(){
        assertArrayEquals(new int[]{1,2,3}, new int[] {1,3,2});
    }

    @Test
    void testCase5(){
        String nullString = null;
        String notNullString = "Frank";
        assertNull(nullString);
        assertNotNull(notNullString);
    }

    @Test
    void add(){
        int actual = Calculator.add(2, 3);
        assertEquals(5, actual,"It is not matching with expected value");
    }
}