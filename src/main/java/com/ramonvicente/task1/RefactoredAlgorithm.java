package com.ramonvicente.task1;

import java.util.Arrays;

public class RefactoredAlgorithm<T extends Comparable<T>> {
    public T[] sort(T[] originalArray) {
        if(originalArray.length <= 1) {
            return originalArray;
        }
        int mid = originalArray.length / 2;
        int fromFirstIndex = 0;
        T[] leftSide = copyArray(originalArray, mid, fromFirstIndex);
        T[] rightSide = copyArray(originalArray, originalArray.length, mid);

        sort(leftSide);
        sort(rightSide);
        merge(originalArray, leftSide, rightSide);
        return originalArray;
    }

    private void merge(T[] array, T[] leftSide, T[] rightSide) {
        int leftSideIndex = 0, rightSideIndex = 0, sortedArrayIndex = 0;
        while(leftSideIndex < leftSide.length && rightSideIndex < rightSide.length) {
            if(leftSide[leftSideIndex].compareTo(rightSide[rightSideIndex]) <= 0 ) {
                array[sortedArrayIndex] = leftSide[leftSideIndex];
                leftSideIndex++;
            }
            else {
                array[sortedArrayIndex] = rightSide[rightSideIndex];
                rightSideIndex++;
            }
            sortedArrayIndex++;
        }
        while(leftSideIndex < leftSide.length) {
            array[sortedArrayIndex] = leftSide[leftSideIndex];
            leftSideIndex++; sortedArrayIndex++;
        }
        while(rightSideIndex < rightSide.length) {
            array[sortedArrayIndex] = rightSide[rightSideIndex];
            rightSideIndex++; sortedArrayIndex++;
        }
    }

    @SuppressWarnings("unchecked")
    private T[] copyArray(T[] originalArray, int mid, int fromFirstIndex) {
        return (T[]) Arrays.stream(originalArray, fromFirstIndex, mid)
                .toArray((Comparable[]::new));
    }
}
