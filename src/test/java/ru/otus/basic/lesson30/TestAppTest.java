package ru.otus.basic.lesson30;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.otus.basic.lesson30.TestApp;

public class TestAppTest {
    private TestApp testApp;
    private Integer[] ar1 = {2, 3, 4, 5};
    private Integer[] arPart = {2, 2, 2};
    private Integer[] arPar = {2, 2, 1, 2, 2, 2};

    @BeforeEach
    public void init() {
        testApp = new TestApp();
    }

    @Test
    void partArrayTestThrow() {
        Assertions.assertThrowsExactly(RuntimeException.class, () -> {
            testApp.partArrays(ar1);
        });
    }

    @Test
    void partArrayTest() {
        Assertions.assertArrayEquals(arPart, testApp.partArrays(arPar));
    }

    @Test
    void partContainTest() {
        Assertions.assertAll(
                () -> {
                    Assertions.assertEquals(true, testApp.containArrays(arPar));
                },
                () -> {
                    Assertions.assertEquals(false, testApp.containArrays(ar1));
                },
                () -> {
                    Assertions.assertEquals(false, testApp.containArrays(arPart));
                }
        );
    }
}
