package com.dailycoding.problem;

/*
Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.
 */

import java.util.Arrays;
import java.util.List;

public class Problem9 {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(2, 4, 6, 2, 5);
        maxSumNonAdjacent(input);
    }

    private static void maxSumNonAdjacent(List<Integer> input) {

        int evenSum =0, oddSum = 0;
        for (int i = 0; i < input.size(); i++) {
            // even sum
            if( i% 2 == 0){
                evenSum+=input.get(i);
            }
            //odd sum
            else{
                oddSum+=input.get(i);
            }
        }
    }
}
