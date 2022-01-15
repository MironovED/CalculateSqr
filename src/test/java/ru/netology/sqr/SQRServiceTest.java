package ru.netology.sqr;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    public void shouldCalculateSqrTest1() {
        SQRService service = new SQRService();
        int bottomLine = 200;
        int topLine = 300;
        int expected = 3;

        long actual = service.calculateSqr(bottomLine, topLine);
        assertEquals(expected, actual);

    }

    @Test
    public void shouldCalculateSqrTest2() {
        SQRService service = new SQRService();
        int bottomLine = 600;
        int topLine = 800;
        int expected = 4;

        long actual = service.calculateSqr(bottomLine, topLine);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateSqrTest3() {
        SQRService service = new SQRService();
        int bottomLine = 5000;
        int topLine = 10000;
        int expected = 29;

        long actual = service.calculateSqr(bottomLine, topLine);
        assertEquals(expected, actual);
    }
}
