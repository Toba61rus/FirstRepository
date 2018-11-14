package oop.ru.dvfu.tabyka;

public class Rectangle {
    float a,b;

    Rectangle(float a1, float b1) {
        this.a = a1;
        this.b = b1;
    }
    void setAB(float a1,float  b1){
    this.a = a1;
    this.b=b1;
    }

    void draw (){
        System.out.println("Нарисуем прямоугольник со сторонами a и b:");
        System.out.println("a = " + a+ " b = "+ b);

    }

   public void setParams(float[]params){
        this.a=params[0];
        this.b=params[1];


    }

}
