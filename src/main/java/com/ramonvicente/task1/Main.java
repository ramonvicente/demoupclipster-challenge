package com.ramonvicente.task1;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        File[] files = new File[]{new File("src/test/resources/list_32.txt"),
                new File("src/test/resources/geography.txt"), new File("src/test/resources/travel.txt"),
                new File("src/test/resources/booking.txt"), new File("src/test/resources/void.txt"),
                new File("src/test/resources/list_13.txt")};

        //System.out.println("Legacy: ");
        //Arrays.stream(LegacyAlgorithm.sort(files)).forEach(e -> System.out.print(e + " "));

        System.out.println("\nRefactored: ");
        RefactoredAlgorithm<File> fileRefactoredAlgorithm = new RefactoredAlgorithm<>();
        Arrays.stream(fileRefactoredAlgorithm.sort(files)).forEach(e -> System.out.print(e + " "));

        File[] files2 = new File[]{new File("src/test/resources/list_32.txt"),
                new File("src/test/resources/geography.txt"), new File("src/test/resources/travel.txt"),
                new File("src/test/resources/booking.txt"), new File("src/test/resources/void.txt"),
                new File("src/test/resources/list_13.txt")};

        System.out.println("\nDefault language: ");
        Arrays.sort(files2, Comparator.reverseOrder());
        Arrays.stream(files2).forEach(e -> System.out.print(e + " "));


    }
}