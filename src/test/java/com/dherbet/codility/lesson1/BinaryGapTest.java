package com.dherbet.codility.lesson1;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinaryGapTest {

    private static GKBinaryGap binaryGap;

    @BeforeClass
    public static void setUp() {
        binaryGap = new GKBinaryGap();
    }

    @Test
    public void problemProvidedInputs() {
        assertEquals(2, binaryGap.solution(9));
        assertEquals(4, binaryGap.solution(529));
        assertEquals(1, binaryGap.solution(20));
        assertEquals(0, binaryGap.solution(15));
        assertEquals(0, binaryGap.solution(32));
        assertEquals(5, binaryGap.solution(1041));
    }

}