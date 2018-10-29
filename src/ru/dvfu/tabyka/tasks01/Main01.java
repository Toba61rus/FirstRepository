package ru.dvfu.tabyka.tasks01;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Данная программа находит сумму x + y");
        System.out.println("Введите значение х:");
        int x = in.nextInt();
        System.out.println("Введите значение у");
        int y = in.nextInt();
        int z = x + y;
        System.out.println("Сумма введенных чисел х + у =" + z);
    }
}