package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testBasicMath1() {
        assertEquals(2, 1 + 1);
    }

    @Test
    void testBasicMath2() {
        assertEquals(4, 2 * 2);
    }

    @Test
    void testBasicMath3() {
        assertEquals(0, 10 % 2);
    }

    @Test
    void testStringLength() {
        assertEquals(5, "hello".length());
    }

    @Test
    void testStringEmpty() {
        assertTrue("".isEmpty());
    }

    @Test
    void testStringConcat() {
        assertEquals("ab", "a" + "b");
    }

    @Test
    void testArrayLength() {
        int[] arr = { 1, 2, 3 };
        assertEquals(3, arr.length);
    }

    @Test
    void testBooleanTrue() {
        assertTrue(true);
    }

    @Test
    void testBooleanFalse() {
        assertFalse(false);
    }

    @Test
    void testNull() {
        Object obj = null;
        assertNull(obj);
    }

    @Test
    void testNotNull() {
        Object obj = new Object();
        assertNotNull(obj);
    }

    @Test
    void testDoubleAddition() {
        assertEquals(3.0, 1.5 + 1.5, 0.001);
    }

    @Test
    void testException() {
        assertThrows(ArithmeticException.class, () -> {
            int a = 1 / 0;
        });
    }

    @Test
    void testStringTrim() {
        assertEquals("test", " test ".trim());
    }

    @Test
    void testStringUpper() {
        assertEquals("TEST", "test".toUpperCase());
    }

    @Test
    void testStringLower() {
        assertEquals("test", "TEST".toLowerCase());
    }

    @Test
    void testMathMax() {
        assertEquals(10, Math.max(5, 10));
    }

    @Test
    void testMathMin() {
        assertEquals(5, Math.min(5, 10));
    }
}
