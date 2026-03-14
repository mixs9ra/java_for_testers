package ru.stqa.geometry.figures;

import static java.lang.String.format;

public class Square {
    public static void printSquere(double side) { // пармаетр функции
        String text = format("Площаль квадрата со стороной %f = %f", side, squareArea(side));
        System.out.println(text); // вывод sout
    }

    private static double squareArea(double a) {
        return a * a;
    }
}
