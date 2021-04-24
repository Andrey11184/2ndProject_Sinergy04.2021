package ru.synergyitacademy.lesson3;

import java.util.Scanner;

public class ПоследовательностьЧиселФибоначчи {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер числа последовательности Фибоначчи от 0 до 46");
        int[] arr = new int[47];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        int i = scanner.nextInt();
        System.out.print(arr[i]);
    }
}


