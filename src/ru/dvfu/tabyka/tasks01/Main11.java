package ru.dvfu.tabyka.tasks01;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        System.out.println(" Данная программа находит диаметр окружности (D) , зная и указывая длину окружности (L) ");
        final double pi = 3.14 ;
        Scanner s = new Scanner(System.in);
        System.out.println(" Введите значение длины окружности (L)");
        double g = s.nextDouble();                           //L=pi *D = 2 * pi * r.
        double d = g /2 *pi;
        System.out.println(" Диаметр окружности, при заданной длины " + g + " составляет " + d*2 );

    }
}
