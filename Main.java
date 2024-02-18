package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите три целых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Введенные числа должны быть положительными.");
            return;
        }

        if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами прямоугольного треугольника");
        } else if (a == b && b != c || b == c && c != a || c == a && a != b) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равнобедренного треугольника");
        } else if (a == b && b == c) {
            System.out.println(a + ", " + b + " и " + c + " являются сторонами равностороннего треугольника");
        } else if (a + b > c && b + c > a && c + a > b) {
            System.out.println(a + ", " + b + " и " + c + " не являются сторонами треугольника");
        } else {
            System.out.println(a + ", " + b + " и " + c + "являются сторонами обычного треугольника");
        }
    }
}