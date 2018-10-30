
package ru.dvfu.tabyka.tasks01;
import java.util.Scanner;

public class Main07 {
    public static void main(String[] args) {
final double pi = 3.14;
       double l = 2 *pi * r ;// Формула нахождения длины окружности L=pi *D = 2 * pi * r.
        System.out.println(" Данная программа находит длину и площадь окружности, указав радиус ");
Scanner s = new Scanner(System.in);
        System.out.println(" Укажите радиус " );
double r = s.nextDouble();
        System.out.println(" При радиусе " + r + "длина окружности равна " + l);
        System.out.println(" Площадь круга составляет " + pi * Math.pow(r , 2));
    }
}
