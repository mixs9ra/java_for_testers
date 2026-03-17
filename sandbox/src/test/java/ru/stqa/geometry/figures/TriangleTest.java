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

    @Test
    void cannotCreateTriangleWithNegativeSide () { // тестом проверю, что не смогу создать треугольник с отрицательной стороной
        try { // Попытка создания треугольниа с отрицательной стороной
            new Triangle(-1.0, 4.0, 5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) { // не должен создаться треугольник с отрицательной стороной - ошибка
        }
        }
    @Test
    void cannotCreateTriangleWithInvalidSides() { // тестом проверю, что сумма двух любых сторон должна быть не меньше третьей стороны
        try {// Попытка создания треугольниа с невалидными данными
            new Triangle(1.0, 1.0, 10.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {}
    }
    }

