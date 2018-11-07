package ru.dvfu.tabyka.tasks04;
import java.util.Scanner;

public class Main04Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Введите значение a ");
        float x = s.nextFloat();
        System.out.println(" Введите значение b ");
        float y = s.nextFloat();
                    System.out.println(" Вы задали переменной a значение " + x + " и переменной b значение " + y);
        System.out.println(" Выберите операцию которую хотели бы выполнить с данными значениями  \n 1. a + b  \n 2. a - b  \n 3. a * b  \n 4. a / b  \n 5. a % b  ");
        int z = s.nextInt();
        switch (z) {
            case 1:
                System.out.println(" Сумма a + b составляет " + x + y);
                break;
            case 2:
                System.out.println(" Разность a и b составляет " + (x-y) );
                break;
            case 3:
                System.out.println(" Произведение a и b составляет "+ x*y);
                break;
            case 4:
                System.out.println(" Частное от деления a  и b составляет " + x/y);
                break;
            case 5:
                System.out.println(" Остаток от деления a и b составляет "+ x % y);
                break;
                default:
                    System.out.println(" Вы задали не верную команду для выполнения операции ");
        }
    }}
