package ru.dvfu.tabyka.tasks04;
import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Данная программа вычисляет последующее чётное число N, после введённого с клавиатуры");
        System.out.println("Введите целое число N");//
        int x = s.nextInt();
        int y = x % 2;
        int z = x + 1;
        int b = x + 2;
        if (y == 1){
            System.out.println("Следующей чётное число  " + z );}
        if (y ==0){
            System.out.println("Следующей чётное число " + b );}

    }
}
