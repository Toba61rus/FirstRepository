package ru.dvfu.tabyka.tasks02;
        import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        System.out.println(" Данная программа меняет местами средние цифры двух трёхзначных чисел ");
        Scanner s= new Scanner(System.in);
        System.out.println(" Введите первое число ");
        int x = s.nextInt();
        System.out.println(" Введите второе число");
        int y = s.nextInt();
        int a = x / 100;
        int b = x % 100 / 10;
        int c = x % 10;
        int a2 = y / 100;
        int b2 = y % 100 / 10;
        int c2 = y % 10;
        System.out.println("После изменения первое число поулчилось " + a + b2 +c + "\nВторое число " + a2 + b + c2);
    }}
