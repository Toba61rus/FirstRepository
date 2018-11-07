package ru.dvfu.tabyka.tasks02;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        System.out.println(" Данная программа расчитывает сумму 1-ой и 3-ой цифры введённого вами числа и разность 2-ой и 4-ой цифры ");
        Scanner s = new Scanner(System.in);
        System.out.println(" ВВедите четырёхзначное число ");
        int x = s.nextInt();
        int a = x /1000;
        int b = x % 1000/100;
        int c = x % 100/10;
        int g = x %10;
        System.out.printf(" Сумма первой и третей цифры составляет " + (a + c )+ "\n Разность второй и четвёртой цифры составляет " + (b - g ));
    }
}
