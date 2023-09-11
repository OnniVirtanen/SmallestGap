package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SmallestGap {
    public static Integer findSmallestGap(List<Integer> integers) {
        validateList(integers);
        List<Integer> sortedList = sortListAndRemoveDuplicates(integers);
        return findSmallestGapFromSortedArray(sortedList);
    }

    private static List<Integer> sortListAndRemoveDuplicates(List<Integer> integersWithPossibleDuplicates) {
        Collections.sort(integersWithPossibleDuplicates);
        Set<Integer> set = new HashSet<>(integersWithPossibleDuplicates);
        return new ArrayList<>(set);
    }

    private static void validateList(List<Integer> integers) {
        if (integers.isEmpty() || integers.size() == 1) {
            throw new IllegalArgumentException("List cannot be empty or contain one element");
        }
    }

    private static Integer findSmallestGapFromSortedArray(List<Integer> integers) {
        int smallestNumberGap = Integer.MAX_VALUE;
        for (int i = 1; i < integers.size(); i++) {
            int currentInterval = integers.get(i) - integers.get(i-1) - 1;
            if (currentInterval < smallestNumberGap) {
                smallestNumberGap = currentInterval;
            }
        }
        return smallestNumberGap;
    }
}
