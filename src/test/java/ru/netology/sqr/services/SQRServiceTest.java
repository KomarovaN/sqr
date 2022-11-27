package ru.netology.sqr.services;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {

    @ParameterizedTest
    // подготовка тестовых данных
    @CsvSource({
            "600, 900, 6", // позитивный
            "100, 900, 21", // граничные значения
            "600, 9801, 75",
            "100, 100, 1",
            "9801, 9801, 1",
            "900, 600, -1", // негативный
            "10, 900, -1",
            "600, 10000, -1",
            "-600, 900, -1",
            "600, -900, -1"
    })
    void shouldCalculateUnderLimit(int start, int finish, int expected) {
        SQRService service = new SQRService();

        // вызываем целевой метод:
        int actual = service.countSqrCalculate(start, finish);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
