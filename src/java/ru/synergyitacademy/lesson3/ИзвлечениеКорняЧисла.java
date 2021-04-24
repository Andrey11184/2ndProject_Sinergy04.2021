package ru.synergyitacademy.lesson3;

import java.util.Scanner;

public class ИзвлечениеКорняЧисла {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для извлечения корня");
        int a = scanner.nextInt();
        double b = Math.sqrt(a);
        if (a % b == 0) {
            System.out.println(b);
        } else {
            System.out.println("Данное число не имеет целочисленного корня");
        }


    }
}
