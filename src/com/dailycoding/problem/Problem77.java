package com.daily.coding;

/*
Given a list of possibly overlapping intervals, return a new list of intervals where all overlapping intervals have been merged.

The input list is not necessarily ordered in any way.

For example, given [(1, 3), (5, 8), (4, 10), (20, 25)], you should return [(1, 3), (4, 10), (20, 25)].
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem77 {

    public static void main(String[] args) {
        Problem77 p = new Problem77();
        int[][] input = {{1, 3}, {5, 8}, {4, 10}, {5, 6}, {20, 25}};
        List<int[]> inputList = Arrays.asList(input);
        p.compute(input, inputList);
    }

    private void compute(int[][] input, List<int[]> inputList) {
        List<Integer> removing = new ArrayList<>();
        for(int i=0; i< input.length; i++) {
            int first = input[i][0];
            int second = input[i][1];
            for(int j=0; j < input.length; j++){
                int compareFirst = input[j][0];
                int compareSecond = input[j][1];
                System.out.println(compareFirst+"---"+compareSecond);
                if((first > compareFirst && second < compareSecond) && j!=i) {
                    inputList.remove(i);
                    break;
                }
            }
        }
        System.out.println(removing);
    }

}
