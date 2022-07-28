public class Main {

    public static void main(String[] args) {
        long[] sales = {5, 20, 30, 6, 60};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Максимальная продажа: " + salesManager.max());
       System.out.println("Обрезанное среднее: " + salesManager.middle());

    }
}
