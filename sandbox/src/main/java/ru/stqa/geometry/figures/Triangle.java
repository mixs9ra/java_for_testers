package ru.stqa.geometry.figures;

import static java.lang.Math.sqrt;
import static java.lang.String.format;

public record Triangle(double a, double b, double c) { // создал публичный класс треугольника с тремя свойствами

    public Triangle { // конструктор рекорда
        if (a<0 || b <0 || c<0) {
            throw new IllegalArgumentException("Triangle side should be non-negative");
        }
        if (a+b < c || a+c < b || b+c <a) {
            throw new IllegalArgumentException("The sum of any two sides must be at least as large as the third side");

        }
    }

    public static void printTriangle(Triangle t) { // параметр функции
        String text1 = format("Периметр треугольника со сторонами %f и %f и %f = %f", t.a(), t.b(), t.c(), t.trianglePerimeter());
        String text2 = format("Полупериметр треугольника со сторонами %f и %f и %f = %f", t.a(), t.b(), t.c(), t.triangleHalfPerimeter());
        String text3 = format("Площадь треугольника со сторонами %f и %f и %f = %f;", t.a(), t.b(), t.c(), t.triangleArea());
            System.out.println(text1);
            System.out.println(text2);// вывод sout
            System.out.println(text3);
    }

    public double trianglePerimeter() { // считаю периметр треугольника
        return a + b + c;
    }

    public double triangleHalfPerimeter() { // полупериметр для формулы Герона
        return trianglePerimeter() / 2;
    }

    public double triangleArea() {
        var hp = triangleHalfPerimeter(); // создаю переменную и присваю значение полупериметра
        return sqrt(hp * (hp - a) * (hp - b) * (hp - c)); // площадь по формуле Герона
    }
}
