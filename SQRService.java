package ru.netology.sqr.services;

public class SQRService {
       public void countsqr (int beginning, int end) {
          int count = 0;
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

