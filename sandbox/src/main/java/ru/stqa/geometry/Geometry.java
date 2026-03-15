package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;
import ru.stqa.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquare(new Square(7.0));
        Square.printSquare(new Square(5.0));
        Square.printSquare(new Square(3.0));

        Rectangle.printRectangleArea(3.0, 5.0);
        Rectangle.printRectangleArea(7.0, 9.0);

        Triangle.printTriangle(new Triangle(3.0, 4.0, 5.0));
    }
}

// было до ввода функции  printSquere
// var side = 7.0; // переменная
//        System.out.println("Площадь квадрата со стороной " + side + "=" + (side * side)); // вывод sout
//
//        side = 5.0; // переменная
//        System.out.println("Площадь квадрата со стороной " + side + "=" + (side * side)); // вывод sout
//
//        side = 3.0; // переменная
//        System.out.println("Площадь квадрата со стороной " + side + "=" + (side * side)); // вывод sout