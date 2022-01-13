package com.daily.coding;

/*
A builder is looking to build a row of N houses that can be of K different colors.
 He has a goal of minimizing cost while ensuring that no two neighboring houses are of the same color.

Given an N by K matrix where the nth row and kth column represents the cost to build the nth house with kth color,
return the minimum cost which achieves this goal.
 */
public class Problem19 {

    public static void main(String[] args) {
        int[][] input = {{14,2,11},{11,14,5},{14,3,10}};
        findLeastCost(input);
    }

    private static void findLeastCost(int[][] input) {
        int houses = input.length;
        int colors = input[0].length;

        int min = 0;
        for(int i=0; i < houses; i++){

        }
    }
}
