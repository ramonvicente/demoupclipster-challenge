package com.ramonvicente.task2;

import java.io.File;
import java.util.Arrays;

public class DefaultSort implements SortAlgorithm<Integer> {

    @Override
    public Integer[] sort(Integer[] input) {
        Arrays.sort(input);
        return input;
    }
}
