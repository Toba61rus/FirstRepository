package ru.dvfu.tabyka.tasks02;
import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        System.out.println("Данная программа считывает введённое вами трехзначное число, удалят среднюю цифры числа и выводит полученный результат на экран ");
        Scanner s = new Scanner(System.in);
        System.out.println("ВВедите трёхзначное число ");
        int g = s.nextInt();
        int a = g /100;
        int b = g %10;
        System.out.printf(" Из введённого вами числа " + g + " получаем число " + a + b);
    }
}
