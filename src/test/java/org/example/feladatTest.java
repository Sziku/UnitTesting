package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class feladatTest {

    @Test
    void classify() {
    }

    @Test
    void szabalyos(){
        feladat feladat = new feladat();

        assertEquals("Equilateral",feladat.classify(3,3,3));
    }
    @Test
    void egyenlo(){
        feladat feladat = new feladat();
        assertEquals("Isosceles",feladat.classify(3,2,2));
    }
    @Test
    void altalanos(){
        feladat feladat = new feladat();
        assertEquals("Scalene",feladat.classify(1,2,3));
    }

}