package ru.netolgy.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sumSales = 0;  // начальное значение суммы продаж
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public long averageSales(long[] sales) {
        long sumSales = sumSales(sales);  // сумма продаж за год
        long averageSales = sumSales / sales.length; // средняя сумма продаж за месяц
        return averageSales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int aboveAverageSales(long[] sales) {
        int aboveMonth = 0; // количество месяцев с продажами выше средних за месяц
        long averageSales = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) { // значит, в рассматриваемом i-м месяце продажи выше средних
                aboveMonth = aboveMonth + 1; // добавляем его
            }
        }

        return aboveMonth;
    }

    public int belowAverageSales(long[] sales) {
        int belowMonth = 0; // количество месяцев с продажами ниже средних за месяц
        long averageSales = averageSales(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) { // значит, в рассматриваемом i-м месяце продажи ниже средних
                belowMonth = belowMonth + 1; // добавляем его
            }
        }

        return belowMonth;
    }
}
