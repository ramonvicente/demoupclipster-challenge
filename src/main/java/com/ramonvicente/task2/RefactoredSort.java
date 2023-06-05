package com.ramonvicente.task2;

import com.ramonvicente.task1.RefactoredAlgorithm;

import java.io.File;

public class RefactoredSort implements SortAlgorithm<Integer> {
    @Override
    public Integer[] sort(Integer[] input) {
        RefactoredAlgorithm<Integer> fileSort = new RefactoredAlgorithm<>();
        return fileSort.sort(input);
    }
}
