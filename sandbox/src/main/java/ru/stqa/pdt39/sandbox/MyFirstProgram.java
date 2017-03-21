package ru.stqa.pdt39.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Alex");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

    Point p = new Point(1,1, 10, 10);
    System.out.println("Расстояние между точками с координатами " + p.x1 + ", " + p.y1 + " и " + p.x2 + ", " + p.y2 + " = " + p.distance());
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }
}