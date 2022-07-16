package ru.netology.sqr.MavenSqr.services;

public class SQRService {


    public int rangeLimit(int a, int b) {

        int c = 0; //Результат расчёта метода

        for (int i = 10; i <= 99; i++) {
            if (i * i >= a && i * i <= b) {
                c = c + 1;
            }
        }
        return c;
    }
}
