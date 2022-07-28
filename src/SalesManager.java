import java.util.Arrays;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long middle(){
        long min = 100000;
        long sum = 0;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        for (int i = 0; i < sales.length; i++) {
            sum +=sales[i];
        }
        long middle = (sum - min - max()) / (sales.length - 2);
        return middle;
    }
}
