import org.junit.jupiter.api.*;

import java.time.Duration;

class SalesManagerTest {
    protected static SalesManager testManager;
    protected static long[] salesTest = {10, 2, 777, 6, 38};

    @BeforeEach
    void setUp() {
        System.out.println("Вызываюсь до выполнения теста");
    }

    @BeforeAll
    static void setUpAll() {
        System.out.println("Вызываюсь до выполнения всех тестов");
        testManager = new SalesManager(salesTest);
    }


    @AfterAll
    static void tearDownAll() {
        System.out.println("Вызываюсь после выполнения всех тестов");
    }

    @Test
    @DisplayName("Проверяем нахождение наибольшего числа")
    void max() {
        int expected = 777;
        Assertions.assertEquals(expected, testManager.max());
        System.out.println("Тест пройден!");
    }

    @Test
    @DisplayName("Проверяем нахождение обрезанного среднего")
    void middle() {
        int expected = 18;
        Assertions.assertEquals(expected, testManager.middle());
        System.out.println("Тест пройден!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Вызываюсь после выполнения теста");
    }

    @Test
    @DisplayName("Проверяем, что обрезанное среднее не равно нулю")
    void middleNotNull() {
        Assertions.assertNotNull(testManager.middle());
        System.out.println("Тест пройден!");
    }

    @Test
    @DisplayName("Проверка на продолжительность")
    void timeout() {
        Assertions.assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(50);
            return "result";
        });
    }
}