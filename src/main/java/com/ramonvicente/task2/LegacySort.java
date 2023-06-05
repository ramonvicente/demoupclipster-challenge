package com.ramonvicente.task2;

import com.ramonvicente.task1.LegacyAlgorithm;

public class LegacySort implements SortAlgorithm<Comparable> {
    @Override
    public Comparable[] sort(Comparable[] input) {
        return  LegacyAlgorithm.sort(input);
    }
}
