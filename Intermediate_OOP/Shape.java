package Intermediate_OOP;

abstract class Shape {
    public abstract void drawLine();
}
class Line extends Shape
{
    public void drawLine()
    {
        System.out.println("drawing a line");
    }
}
class Rectangle extends Shape
{
    public void drawLine()
    {
        System.out.println("drawing a rectangle");
    }
}
class Cube extends Shape {
    public void drawLine() {
        System.out.println("drawing a cube");
    }

    public static void main(String[] args) {
        Line a = new Line();
        Rectangle b = new Rectangle();
        Cube c = new Cube();
        a.drawLine();
        b.drawLine();
        c.drawLine();
    }
}