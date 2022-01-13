package com.daily.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given a list of integers, return the largest product that can be made by multiplying any three integers.

For example, if the list is [-10, -10, 5, 2], we should return 500, since that's -10 * -10 * 5.

You can assume the list has at least three integers.
 */
public class Problem69 {
    int maxProduct = 1;
    List<Integer[]> list_of_combinations = new ArrayList<>();
    public static void main(String[] args) {
        int[] input = {-10, -10, 5, 2, 5};
        int r = 3;
        int size = input.length;
        Problem69 p = new Problem69();
        int maxProduct = p.getMaxProduct(input, size, r);
        System.out.println(maxProduct);
    }

    private int getMaxProduct(int[] input, int size, int r) {
        int product = 1;
        int maxProduct = 1;
        int[] data = new int[r];
        List<Integer[]> combinations = computeCombinations(input, data, 0, size - 1, 0, r);
        for (Integer[] each: combinations) {
            product = 1;
            for (Integer nums: each) {
                product = product * nums;
            }
            if( maxProduct < product) {
                maxProduct = product;
            }
        }

        return maxProduct;
    }

    private List<Integer[]> computeCombinations(int[] input, int[] data, int start, int end, int index, int r) {

        if (index == r) {
           Integer[] ary = Arrays.stream( data ).boxed().toArray( Integer[]::new );
           list_of_combinations.add(ary);
           return list_of_combinations;
        }

        for( int i=start; i<=end && end-i+1 >= r-index; i++) {
            data[index] = input[i];
            computeCombinations(input, data, i+1, end, index+1, r);
        }
        return list_of_combinations;
    }
}
