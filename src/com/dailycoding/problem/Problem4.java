package com.dailycoding.problem;


/*
Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.

 */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Problem4 {

    public static void main(String[] args) {
        Integer[] input = {3,4,-1,1};
        missingPositiveInteger(input);
    }

    private static void missingPositiveInteger(Integer[] input) {
        List<Integer> inputList = Arrays.asList(input);
        Collections.sort(inputList);
        for (int i = 0; i < inputList.size(); i++) {

        }
    }
}
