package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        assertEquals(5, App.add(2, 3));
    }

    @Test
    public void testSubtract() {
        assertEquals(6, App.subtract(10, 4));
    }

    @Test
    public void testMultiply() {
        assertEquals(12, App.multiply(3, 4));
    }

    @Test
    public void testDivide() {
        assertEquals(5.0, App.divide(10, 2), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        App.divide(10, 0);
    }
}
