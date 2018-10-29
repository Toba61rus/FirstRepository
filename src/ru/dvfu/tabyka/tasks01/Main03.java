package ru.dvfu.tabyka.tasks01;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.println("Введите целое число N");// Составить решение без оператор if пока не смог.
        int x = s.nextInt();
        int y = x % 2;
        int z = x + 1;
        int b = x + 2;
        if (y == 1){
            System.out.println("Следующей чётное число после введенного Вами " + z );}
        if (y ==0){
            System.out.println("Следующей чётное число после введенного Вами " + b );}

    }
}
