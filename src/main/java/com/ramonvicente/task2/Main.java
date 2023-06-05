package com.ramonvicente.task2;

import com.ramonvicente.task1.RefactoredAlgorithm;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Integer[] integers = generateRandomArray(100);

        System.out.println("Original values: ");
        Arrays.stream(integers).forEach(i-> System.out.print(i + " "));

        LegacySort legacy = new LegacySort();
        legacy.sort(integers);
        System.out.println("Legacy algorithm: ");
        Arrays.stream(integers).forEach(i-> System.out.print(i + " "));

        RefactoredSort refactored = new RefactoredSort();
        refactored.sort(integers);
        System.out.println("Refactored algorithm: ");
        Arrays.stream(integers).forEach(i-> System.out.print(i + " "));


        DefaultSort defaultSort = new DefaultSort();
        defaultSort.sort(integers);
        System.out.println("Refactored algorithm: ");
        Arrays.stream(integers).forEach(i-> System.out.print(i + " "));
    }

    public static Integer[] generateRandomArray(int n){
        Integer[] array = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(1000);
        }

        return array;
    }
}