package com.daily.coding;

/*

This problem was asked by Facebook.

Given an array of integers, write a function to determine whether the array could become non-decreasing by modifying at most 1 element.

For example, given the array [10, 5, 7], you should return true, since we can modify the 10 into a 1 to make the array non-decreasing.

Given the array [10, 5, 1], you should return false, since we can't modify any one element to get a non-decreasing array.

*/

import java.util.ArrayList;
import java.util.List;

public class Problem79 {

    int iterations = 0;
    List<Integer> roadBlocks = new ArrayList<>();
    private boolean compute(int[] input) {

        iterations++;
        for (int i = 0; i < input.length - 1; i++) {
            int first = input[i];
            int second = input[i+1];
            if(first > second) {
                input[i] = second;
                roadBlocks.add(i);
            }
        }
        for (int each: input) {
            System.out.print(each+", ");
        }
        System.out.println();
        if(roadBlocks.size() == 1 && iterations < 2) {
            compute(input);
        }

        if(roadBlocks.size() > 1) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] input = {10, 5, 7};
        Problem79 p = new Problem79();
        boolean fin = p.compute(input);
        System.out.println(fin);
    }
}
