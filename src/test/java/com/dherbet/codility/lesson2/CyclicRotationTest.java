package com.dherbet.codility.lesson2;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CyclicRotationTest {

    private static GKCyclicRotation cyclicRotation;

    @BeforeClass
    public static void setUp() {
        cyclicRotation = new GKCyclicRotation();
    }

    @Test
    public void problemProvidedInputs() {
        assertArrayEquals(new int[]{9,7,6,3,8}, cyclicRotation.solution(new int[]{3,8,9,7,6}, 3));
        assertArrayEquals(new int[]{0,0,0}, cyclicRotation.solution(new int[]{0,0,0}, 1));
        assertArrayEquals(new int[]{1,2,3,4}, cyclicRotation.solution(new int[]{1,2,3,4}, 4));
    }

}