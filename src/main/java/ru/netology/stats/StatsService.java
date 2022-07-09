package ru.netology.stats;

public class StatsService {

    public long calcSumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;

        }
        return sum;
    }

    public long findAverage(long[] sales) {
        return calcSumSales(sales) / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int findBelowAverage(long[] sales) {
        long avg = findAverage(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }

        }
        return count;
    }

    public int findAboveAverage(long[] sales) {
        long avg = findAverage(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }

        }
        return count;

    }
}
