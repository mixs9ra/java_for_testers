public class Geometry {
    public static void main(String[] args) {
        printSquere(7.0);
        printSquere(5.0);
        printSquere(3.0);

        printRectanglArea(3.0, 5.0);
        printRectanglArea(7.0, 9.0);
    }

    private static void printRectanglArea(double a, double b) {
        System.out.println("Площаль треугольника со сторонами " + a + " и "+ b + " = " + rectanglArea(a,b)); // вывод sout
    }

    private static double rectanglArea(double a, double b) {
        return a * b;
    }

    static void printSquere(double side) { // пармаетр функции
        System.out.println("Площаль квадрата со стороной " + side + " = " + squareArea(side)); // вывод sout
    }

    private static double squareArea(double a) {
        return a * a;
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