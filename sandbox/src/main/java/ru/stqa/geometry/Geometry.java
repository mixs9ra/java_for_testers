package ru.stqa.geometry;

import ru.stqa.geometry.figures.Rectangle;
import ru.stqa.geometry.figures.Square;

public class Geometry {
    public static void main(String[] args) {
        Square.printSquere(7.0);
        Square.printSquere(5.0);
        Square.printSquere(3.0);

        Rectangle.printRectanglArea(3.0, 5.0);
        Rectangle.printRectanglArea(7.0, 9.0);
    }

}

// было до ввода функции  printSquere
// var side = 7.0; // переменная
//        System.out.println("Площаль квадрата со стороной " + side + "=" + (side * side)); // вывод sout
//
//        side = 5.0; // переменная
//        System.out.println("Площаль квадрата со стороной " + side + "=" + (side * side)); // вывод sout
//
//        side = 3.0; // переменная
//        System.out.println("Площаль квадрата со стороной " + side + "=" + (side * side)); // вывод sout