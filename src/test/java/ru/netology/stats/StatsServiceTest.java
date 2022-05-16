package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void shouldSum() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = manager.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldMinSale() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = manager.minSales(sales);
        long expected = 9;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldSumAverage() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = manager.sumAverage(sales);
        long expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSale() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = manager.maxSales(sales);
        long expected = 8;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void shouldMinSumAverage() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = manager.minSumAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldMaxSumAverage() {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = manager.maxSumAverage(sales);
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}


















