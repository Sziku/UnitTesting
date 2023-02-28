package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class AdderTest {

//    @BeforeEach
//    void setUp() {
//    }
//
//    @AfterEach
//    void tearDown() {
//    }

    @Test
    void add() {
    }
    @Test
    void addPositives(){
        Adder adder = new Adder();
        System.out.println(adder.add(5,3));
        assertEquals(9, adder.add(5,4), "nem jo");
    }
    @Test
    void addNegatives(){
        Adder adder = new Adder();
        System.out.println(adder.add(-2,-3));
        assertEquals(-5, adder.add(-2,-3), "nem jo");
    }
    @Test
    void addToNull() {
        Adder adder = new Adder();
        assertThrows(NullPointerException.class, () -> {
            adder.add(null, 3);
        });
    }
}