package oop.ru.dvfu.tabyka;

public abstract class Shape {
    protected float x,y;
    //Мектод назначения параметров точки опоры
    void setXY(float x1,float y1) {
        this.x = x1;
        this.y = y1;}

void colour (toString(){
this.colour=colour;}

        abstract void draw();
        //Метод определения  отображения объектов
        abstract void draw();
        //Метод задания параметров
        abstract void setParams(float[]params);
        //Метод получения площади фигуры
        abstract double getArea();
        //Метод  получения перимитра фигуры
        abstract double getPerimetr();
}
