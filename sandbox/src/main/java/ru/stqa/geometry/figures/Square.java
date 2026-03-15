package ru.stqa.geometry.figures;

import static java.lang.String.format;

public record Square(double side) {


    public static void printSquare(Square s) { // параметр функции
        String text = format("Площадь квадрата со стороной %f = %f", s.side, s.area());
        System.out.println(text); // вывод sout
    }

    public double area() {
        return this.side * this.side;
    }

    public double perimeter() {
        return 4*this.side;
    }
}
