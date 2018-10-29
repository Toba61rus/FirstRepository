package ru.dvfu.tabyka.tasks01;
import java.util.Scanner;


public class Main06 {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);
        System.out.println("ВВедите число, которое хотите возвести в степень");
        int a = s.nextInt();
        System.out.println("ВВедите степень, в которую хотите возвести указанное ранее число");
        int b = s.nextInt();
        System.out.println("Число а возведённое в степень b равно " + Math.pow(a, b));
    }
}
