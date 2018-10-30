package ru.dvfu.tabyka.tasks01;
import  java.util.Scanner;

public class Main09 {
    public static void main(String[] args) {
        System.out.println("Данная программа переводит введённое Вами число километров в морские и сухопутные мили");
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число км, которое хотите перевести в сухопутные и морские мили");
        double g = s.nextInt();
        double d = g/1.852;             //В одной морской мили 1.852 км.
        double p = g/1.60934;           //В одной сухопутной мили 1.60934 км.
        System.out.println( g + " киллометра  приравниваются к " + d + " морским  и " + p + " сухопутным милям ");

    }
}
