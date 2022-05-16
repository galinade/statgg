package ru.netology.stats;

public class StatsService {
    public long sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int minSales(int[] sales) {
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

    public long sumAverage(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        long sumA = sum/sales.length;

        //long sumA = sum(sales) / sales.length;

        return sumA;
    }

    public int maxSales(int[] sales) {
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

    public long minSumAverage(int[] sales) {
        int minSA = 0;
        for (int sale : sales) {
            if (sumAverage(sales) > sale)
                minSA++;
        }
        return minSA;
    }

    public long maxSumAverage(int[] sales) {
        int maxSA = 0;
        for (int sale : sales) {
            if (sumAverage(sales) < sale)
                maxSA++;
        }
        return maxSA;
    }
}

