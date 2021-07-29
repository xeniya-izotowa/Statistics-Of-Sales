package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int sumOfAllSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return  sum;
    }

    public int averageSale(long[] sales) {
        StatsService service = new StatsService();
        int average = (service.sumOfAllSales(sales)) / 12;

        return average;
    }

    public int monthOfMaxSales(long[] sales) {
        int month = 0;
        int maxMonth = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month +1;
        }
        return maxMonth + 1;
    }

    public int monthsOfSalesBelowAverage(long[] sales) {
        StatsService service = new StatsService();
        int monthsOfSalesBelowAverage = 0;
        for (long sale : sales) {
            if (sale < service.averageSale(sales)) {
                monthsOfSalesBelowAverage++;
            }
        }
        return monthsOfSalesBelowAverage;
    }

    public int monthsOfSalesAboveAverage(long[] sales) {
        StatsService service = new StatsService();
        int monthsOfSalesAboveAverage = 0;
        for(long sale : sales) {
            if (sale > service.averageSale(sales)) {
                monthsOfSalesAboveAverage++;
            }
        }
        return monthsOfSalesAboveAverage;
    }
}
