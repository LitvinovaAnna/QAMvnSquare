package ru.netology.javaqa.javaqamvn.sqrservice.SqrService;

public class SqrService {
    public int calcSqr(int from, int to) { // границы нашего диапазона

        int sum = 0; // переменная, для подсчёта чисел, которые попадают в наш диапазон
        int maxNumber = 99; // i не больше, чем это число
        for (int i = 0; i <= maxNumber; i++) {
            if (i * i >= from && i * i <= to) {
                sum = sum + 1;
            }
        }
        return sum;
    }
}


