package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {

    @Test
    public void whenException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    new Factorial().calc(-1);
                });
        assertThat(exception.getMessage()).isEqualTo("A could not be less than 0");
    }

    @Test
    public void calc() {
        int n = 8;
        int expected = 40320;
        int result = new Factorial().calc(n);
        assertThat(result).isEqualTo(expected);
    }
}