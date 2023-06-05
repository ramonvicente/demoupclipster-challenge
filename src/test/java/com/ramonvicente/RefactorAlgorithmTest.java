package com.ramonvicente;

import com.ramonvicente.task1.RefactoredAlgorithm;
import org.junit.Assert;
import org.junit.Test;

public class RefactorAlgorithmTest {

    @Test
    public void should_return_sorted_string_array() {
        String[] array = new String[]{"Rome", "Oslo", "Brasilia", "Glasgow", "Frankfurt", "Acapulco", "Shanghai", "Palermo"};
        String[] expected = new String[]{"Acapulco", "Brasilia", "Frankfurt", "Glasgow", "Oslo", "Palermo", "Rome", "Shanghai"};

        RefactoredAlgorithm<String> algorithm = new RefactoredAlgorithm<>();

        algorithm.sort(array);

        Assert.assertArrayEquals(expected, array);
    }
}
