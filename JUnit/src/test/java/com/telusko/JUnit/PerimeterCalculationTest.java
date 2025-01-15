package com.telusko.JUnit;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class PerimeterCalculationTest {

    @BeforeAll
    static void BeforeAll(){
        System.out.println("Before all it will be executed..");
    }
    //Make it class level variable...
    perimeterCalculator pc;

    @BeforeEach
    void init(){
        pc = new perimeterCalculator();
    }
    @Test
    void perimeterCalculationCircleTest(){
        //perimeterCalculator pc = new perimeterCalculator();
        assertEquals(79.25, pc.calcutePerimeterCircle(5));
        //System.out.println("its completed");
    }
    @Test
    void perimeterCalculationSquareTest(){
        //perimeterCalculator pc = new perimeterCalculator();
        assertEquals(25, pc.calculatePerimeterSquare(5));
        //System.out.println("its completed");
    }

    @AfterEach
    void msg(){
        System.out.println("its completed");
    }
}
