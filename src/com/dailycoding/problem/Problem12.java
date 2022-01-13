package com.daily.coding;

/*
There exists a staircase with N steps, and you can climb up either 1 or 2 steps at a time.
Given N, write a function that returns the number of unique ways you can climb the staircase. The order of the steps matters.

For example, if N is 4, then there are 5 unique ways:

1, 1, 1, 1
2, 1, 1
1, 2, 1
1, 1, 2
2, 2

 */

public class Problem12 {

    private int count = 1;

    public static void main(String[] args) {
        int n = 4;
        Problem12 p = new Problem12();
        System.out.println(p.totalUniqueWays(n));
    }

    private int totalUniqueWays(int n) {
        int totalTwos = n / 2;
        int ones;
        if (n % 2 == 1) {
            count = count + (n / 2) + 1;
        } else {
            count = count + 1;
        }
        totalTwos = totalTwos - 1;
        while (totalTwos > 0) {
            ones = n - (2 * totalTwos);
            count = count + combinations(ones, totalTwos);
            totalTwos--;
        }
        return count;
    }

    private int combinations(int ones, int twos) {
        return factorial(ones + twos) / (factorial(ones) * factorial(twos));
    }

    private int factorial(int n) {
        int fact = 1;
        if (n == 0)
            return 1;

        while (n > 1) {
            fact = fact * n;
            n = n - 1;
        }
        return fact;
    }
}
