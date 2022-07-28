import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int middle(){
        int min = 100000;
        int sum = 0;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        for (int i = 0; i < sales.length; i++) {
            sum +=sales[i];
        }
        int middle = (sum - min - max()) / (sales.length - 2);
        return middle;
    }
}
