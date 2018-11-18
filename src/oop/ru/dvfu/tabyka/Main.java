package oop.ru.dvfu.tabyka;
import javafx.scene.shape.Circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(30,45);
        rectangle1.draw();
        System.out.println("\nНазначаем произвольноые параметры:");

        Scanner in=new Scanner(System.in);
        System.out.println("ВВедите размер сторон прямоугольника , a и b ");
        rectangle1.setAB(in.nextFloat(),in.nextFloat());
        System.out.println("Введите координаты точки опоры (x, y): ");
        rectangle1.setParams(in.nextFloat(),in.nextFloat());
        rectangle1.draw();
    }
}
