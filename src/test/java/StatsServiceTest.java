import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netolgy.stats.StatsService;

public class StatsServiceTest {

    @Test
    public void shouldSumSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSumSales = 180;
        int actualSumSales = service.sumSales(sales);

        Assertions.assertEquals(expectedSumSales, actualSumSales);
    }

    @Test
    public void shouldAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedAverageSales = 15;
        double actualAverageSales = service.averageSales(sales);

        Assertions.assertEquals(expectedAverageSales, actualAverageSales);

    }

    @Test
    public void shouldMonthMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxMonth = 8;
        int actualMaxMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void shouldMonthMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;
        int actualMinMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void shouldAmountMonthSalesAboveAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAboveMonth = 5;
        double actualAboveMonth = service.aboveAverageSales(sales);

        Assertions.assertEquals(expectedAboveMonth, actualAboveMonth);

    }

    @Test
    public void shouldAmountMonthSalesBelowAverage() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedBelowMonth = 5;
        double actualBelowMonth = service.belowAverageSales(sales);

        Assertions.assertEquals(expectedBelowMonth, actualBelowMonth);

    }


}

