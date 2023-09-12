package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SmallestGap {
    public static Integer findSmallestGap(final List<Integer> integers) {
        validateList(integers);
        List<Integer> uniqueIntegers = removeDuplicates(integers);
        List<Integer> sortedList = sortList(uniqueIntegers);
        return findSmallestGapFromSortedList(sortedList);
    }

    private static void validateList(final List<Integer> integers) {
        if (integers.isEmpty() || integers.size() == 1) {
            throw new IllegalArgumentException("A list with minimum of two elements should be provided.");
        }
    }

    private static List<Integer> removeDuplicates(final List<Integer> integers) {
        Set<Integer> set = new HashSet<>(integers);
        return new ArrayList<>(set);
    }

    private static List<Integer> sortList(final List<Integer> integers) {
        return integers.stream().sorted().collect(Collectors.toList());
    }

    private static Integer findSmallestGapFromSortedList(final List<Integer> integers) {
        int smallestNumberGap = Integer.MAX_VALUE;
        for (int i = 1; i < integers.size(); i++) {
            int currentInterval = integers.get(i) - integers.get(i - 1) - 1;
            if (currentInterval < smallestNumberGap) {
                smallestNumberGap = currentInterval;
            }
        }
        return smallestNumberGap;
    }
}
