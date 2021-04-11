package ru.synergyitacademy.lesson3;

public class ПростыеЧисла {
    public static void main(String[] args) {
        int i, j;
        boolean num;
        for (i = 1; i < 1000; i++) {
            num = true;
            for (j = 2; j <= i / j; j++)
                if ((i % j) == 0) {
                    num = false;
                }
            if (num) {
                System.out.println(i);
            }
        }
    }
}

