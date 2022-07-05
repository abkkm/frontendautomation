package com.example.demo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    private MyClass tester;

    @BeforeEach
    void setUp() {
        tester = new MyClass();
    }

    @AfterEach
    void tearDown() {
    }

    void testExceptionIsThrown() {
        assertThrows(IllegalArgumentException.class, () -> tester.multiply(1000, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50, tester.multiply(10, 5), "10 x 5 must be 50");
    }

    @Test
    public void testGrouped() {
        assertAll( //
                () -> assertThrows(IllegalArgumentException.class, () -> tester.multiply(1, 5)),
                () -> assertEquals(501, tester.multiply(10, 5), "10 x 5 must be 50")
        );

    }
}