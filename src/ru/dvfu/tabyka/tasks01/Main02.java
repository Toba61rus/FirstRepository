package ru.dvfu.tabyka.tasks01;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner g = new Scanner(System.in);
        System.out.println("Введите двузначное число");
        int x = g.nextInt();

        if (x<10 ){                                     // Как задать несколько условий оператором???
            System.out.println("Данное число не является двузначным");}

        if (x>0){
            int y = x / 10;
            System.out.println("Колличество десятков в числе " + y);
        }
        if (x<0)
            System.out.println("Введённое Вами число не является целым");

    }
}


