import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void setUpAll(){
        System.out.println("Before all is executed!");
    }

    @AfterAll
    static void tearDownAll(){
        System.out.println("After all is executed!");
    }

    @BeforeEach
    void setUpEach(){
        System.out.println("Before each is executed!");
    }

    @AfterEach
    void tearDownEach(){
        System.out.println("After each is executed!");
    }

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
    void testCase6(){
        Calculator c1 = new Calculator();
        Calculator c2 = c1;
        Calculator c3 = new Calculator();
        assertSame(c1, c2);
        assertNotSame(c1, c3);
    }

    @Test
    void add(){
        int actual = Calculator.add(2, 3);
        assertEquals(5, actual,"It is not matching with expected value");
    }

    @Test
    void add2(){
        assertThrows(IllegalArgumentException.class, () ->Calculator.add2(5,2));
        //assertThrows(IllegalAccessException.class, () ->Calculator.add2(5,2));
        //assertThrows(IllegalArgumentException.class, () ->Calculator.add2(1,2));
    }
}