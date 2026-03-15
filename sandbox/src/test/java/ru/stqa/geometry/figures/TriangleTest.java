package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test // тест периметр
    void canCalculatePerimeterTriangle() {
        Assertions.assertEquals(12.0, new Triangle(3.0, 4.0, 5.0).trianglePerimeter());
    }
    @Test // тест площадь треугольника
    void canCalculateAreaTriangle() {
        Assertions.assertEquals(6.0, new Triangle(3.0, 4.0, 5.0).triangleArea());

    }
}
