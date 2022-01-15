package ru.netology.sqr;

public class SQRService {
    int count = 0;

    public int calculateSqr(int bottomLine, int topLine) {
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bottomLine && i * i <= topLine) {
                count = count + 1;
            }
        }
        return count;
    }

}

