package ru.dvfu.tabyka.tasks01;
import java.util.Scanner;


public class Main05 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Данная программа находит корень линейного уровнения ax + b = 0.");
    System.out.println("Введите значение a  ");
        double r = s.nextInt();
        Scanner g = new Scanner(System.in);
    System.out.println("Введите значение b  ");
        double z = g.nextInt();
        double w = -z /r;
    System.out.println("Корнем данного уровнения с заданным Вами значениями является "+ w);
    }
}
