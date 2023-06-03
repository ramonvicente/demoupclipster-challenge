package com.ramonvicente;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Comparable[] arrays = new Integer[]{4, 1, 12, 9, 3, 5, 12};
        Arrays.stream(LegacySort.sort(arrays)).forEach(e -> System.out.print(e + " "));
    }
}