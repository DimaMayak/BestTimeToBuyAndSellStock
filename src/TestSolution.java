import org.junit.Test;

import static org.junit.Assert.*;

public class TestSolution {
    @Test
    public void testSolutionMaxProfit() throws Exception {
        int[] i = {7, 1, 5, 3, 6, 4};
        assertEquals(5, Solution.maxProfit(i));
        int[] j = {7, 6, 4, 3, 1};
        assertEquals(0, Solution.maxProfit(j));
    }
    @Test
    public void testSolutionMaxProfitBrute() throws Exception {
        int[] i = {7, 1, 5, 3, 6, 4};
        assertEquals(5, Solution.maxProfitBrute(i));
        int[] j = {7, 6, 4, 3, 1};
        assertEquals(0, Solution.maxProfitBrute(j));
    }
}
