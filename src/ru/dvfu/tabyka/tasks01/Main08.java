package ru.dvfu.tabyka.tasks01;
import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Данная программа переводит рубли в доллары и евро");
        System.out.println(" Пожалуйста, введите количество рублей, которое хотели бы перевести в доллары и евро ");
        double g = s.nextDouble();
        double x = g /65.56;
        double y = g /74.67;
        System.out.println( g +  " рублей равно " + x +" долларам " + " и " + y +  " евро по курсу на 29.10.2018 г." );
    }
}
