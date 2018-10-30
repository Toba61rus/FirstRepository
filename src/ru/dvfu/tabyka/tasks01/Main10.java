package ru.dvfu.tabyka.tasks01;
import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        System.out.println("Данная программа расчитает сумму (S) двух чисел а + b, после чего расчитает процент заданного и введённого вами числа(P) от полученной раннее суммы S ");
        Scanner s = new Scanner(System.in);
        System.out.println(" Введите первое слагаемое a ");
        double a = s.nextDouble();
        System.out.println(" Введите второе слагаемое b ");
        double b = s.nextDouble();
        double S = a + b;
        System.out.println(" Сумма слагаемых составляет " + S );
        System.out.println(" Введите число, процент которого хотели бы отсчитать от полученного числа S (ввелённое число должно быть натуральным и не больше числа S ) ");
        double p = s.nextDouble();
        double procent = p * 100 / S;
        System.out.println(" Процент числа P от полученной суммы составляет " + procent + " % " );



    }
}
