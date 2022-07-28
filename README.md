# **Анализ статистики продаж**
## Программа анализирует статистику продаж
### *Для того, чтобы выполнить программу, необходимо:*
* Создать массив цен на серию продуктов
* Запустить программу
* На выходе получить максимальное значение цены.

### Для обработки информации используется программа:

```javascript
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
}
```