package ru.netology.sqr.services;

public class SQRService {
        public int countSqrCalculate(int beginning, int end) {
            int count = 0;
            int min = 10*10;
            int max = 99*99;
            if (beginning > end | beginning < min | end > max) {
                return -1;
            }
            for (int i = 10; i <= 99; i++) {
                if (i * i >= beginning) {
                    if (i * i <= end) {
                        count++;
                    }
                }
            }
            return count;
        }
}
