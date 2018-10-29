package ru.dvfu.tabyka.tasks01;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.println("Данная программа определяет количество десятков введенного двузначного числа");
        System.out.println("Введите двузначное число");
        int x = g.nextInt();

        if (x<10 ){                                     // Как задать несколько условий оператором???Чтобы выполнялось условие 0<x<100 (х было двузначным числом)
            System.out.println("Данное число не является двузначным");}

        if (x>0){
            int y = x / 10;
            System.out.println("Колличество десятков в числе " + y);
        }
        if (x<0)
            System.out.println("Введённое Вами число не является целым");

    }
}


