package ru.netology.sqr.MavenSqr.services;

public class SQRService {


    public int rangeLimit(int underLimit, int upperLimit) {

        int countSolutions = 0; //Результат расчёта метода

        for (int i = 10; i <= 99; i++) {
            if (i * i >= underLimit && i * i <= upperLimit) {
                countSolutions = countSolutions + 1;
            }
        }
        return countSolutions;
    }
}
