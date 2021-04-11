package ru.synergyitacademy.lesson3;

import java.util.Scanner;

public class РешениеКвадратныхУравнений {
    public static void main(String[] args) {
        System.out.println("Для решения квадратного уравнения требуется ввести коэффиценты a,b и c.");
        System.out.println("Введите коэффицент a");
        Scanner scanner = new Scanner(System.in);
        double a;
        a = scanner.nextDouble();
        if (a == 0){
            System.out.println("Коэффицент а не может быть равен 0");
        }
        a = scanner.nextDouble();
        System.out.println("Введите коэффицент B");
        new Scanner(System.in);
        double b = scanner.nextDouble();
        System.out.println("Введите коэффицент c");
        new Scanner(System.in);
        double c = scanner.nextDouble();
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else {
            System.out.println("Нет действительных решений уравнения");
        }
    }
}
