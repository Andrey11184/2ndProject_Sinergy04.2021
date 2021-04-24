package ru.synergyitacademy.lesson3;

public class ПростыеЧисла {
    public static void main(String[] args) {
        int i, j;
        boolean flag;
        for (i = 1; i < 1000; i++) {
            flag = true;
            for (j = 2; j <= i / j; j++)
                if ((i % j) == 0) {
                    flag = false;
                }
            if (flag) {
                System.out.println(i);
            }
        }
    }
}

