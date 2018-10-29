package ru.dvfu.tabyka.tasks01;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Данная программа вычисляет среднее арифмитическое введённых с клавиатуры трёх  чисел ");
        System.out.println("Ведите первое вещественное число");
        float x = s.nextInt();
        System.out.println("Введите второе вещественное число");
        float y = s.nextInt();
        System.out.println("Введите третее вещественное число");
        float z = s.nextInt();
        float c = (x+y+z)/3;
        System.out.println(" Среднее арифмитическое введённых вами чисел составляет " + c);
    }
}
