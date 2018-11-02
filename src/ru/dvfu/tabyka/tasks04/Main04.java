package ru.dvfu.tabyka.tasks04;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        System.out.println(" Здравствуйте, Вас преветствует калькулятор! ");
        Scanner x = new Scanner (System.in);
        switch (x){
            case 1:
                System.out.println(" a + b ");
                break;
            case 2:
                System.out.println(" a - b ");
                break;
            case 3:
                System.out.println(" a * b ");
                break;
            case 4:
                System.out.println(" a / b ");
                break;
            case 5:
                System.out.println(" a % b ");
                break;
                default:
                    System.out.println(" Данное число  меньше 1 и больше 5 ");


        }
    }
}
