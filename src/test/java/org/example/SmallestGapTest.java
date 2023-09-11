package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

class SmallestGapTest {

    @Test
    void findSmallestGap_regularScenario_returnsCorrectInteger() {
        // Arrange
        final List<Integer> integers = Arrays.asList(1,4,10);
        int expected = 2;

        // Act
        int actual = SmallestGap.findSmallestGap(integers);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void findSmallestGap_differentOrder_returnsCorrectInteger() {
        // Arrange
        final List<Integer> integers = Arrays.asList(4,1,10);
        int expected = 2;

        // Act
        int actual = SmallestGap.findSmallestGap(integers);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void findSmallestGap_sameNumbers_returnsCorrectInteger() {
        // Arrange
        final List<Integer> integers = Arrays.asList(1,4,1,4,10,4);
        int expected = 2;

        // Act
        int actual = SmallestGap.findSmallestGap(integers);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void findSmallestGap_duplicateGap_returnsCorrectInteger() {
        // Arrange
        final List<Integer> integers = Arrays.asList(1,3,5);
        int expected = 1;

        // Act
        int actual = SmallestGap.findSmallestGap(integers);

        // Assert
        assertEquals(expected, actual);
    }
}