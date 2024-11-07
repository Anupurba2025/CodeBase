package com.telusko.JUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAdd(){
        Calculator c = new Calculator();
        int num1=5;
        int num2=10;

        int result = c.add(num1,num2);

        // Assert
        assertEquals(15, result, "The add method should return the sum of num1 and num2");
    }
}
