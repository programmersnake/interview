package array.task_92_564.solution.impl;

import array.task_92_564.solution.Solution92_564;

import java.util.stream.IntStream;

/**
 * Runtime: 5 ms
 * Memory Usage: 41.4 MB
 *
 * Too long time, but less code.
 * First solution I like more.
 */
public class SolutionImpl2 implements Solution92_564 {
    @Override
    public int maxProfit(int[] prices) {
        return IntStream.range(0, prices.length - 1)
                .filter(i -> prices[i] < prices[i + 1])
                .map(i -> (prices[i + 1] - prices[i]))
                .sum();
    }
}
