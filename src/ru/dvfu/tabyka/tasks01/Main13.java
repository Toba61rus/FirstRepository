package ru.dvfu.tabyka.tasks01;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        System.out.println(" Данная программа меняет переменные a и b местами ");
        Scanner s = new Scanner(System.in);
        int c;
             System.out.println(" Введите значение a ");
        int g =s.nextInt();
        System.out.println(" Введите значение b ");
        int x = s.nextInt();
        System.out.println(" Вы задали переменной a значение " + g + " а переменной b значение " + x );
        System.out.println(" Для замены переменных местами введите 1 и нажмите кнопку Enter ");
        int y = s.nextInt();
        if (y ==1 ){
        System.out.println(" При смене переменных мы поулчаем " + (c = g); (g = x);( x = c);)}

    }
}
