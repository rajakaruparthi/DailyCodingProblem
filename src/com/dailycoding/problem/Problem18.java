package com.daily.coding;

/*
Given an array of integers and a number k, where 1 <= k <= length of the array, compute the maximum values of each subarray of length k.

For example, given array = [10, 5, 2, 7, 8, 7] and k = 3, we should get: [10, 7, 8, 8], since:

10 = max(10, 5, 2)
7 = max(5, 2, 7)
8 = max(2, 7, 8)
8 = max(7, 8, 7)

Do this in O(n) time and O(k) space.
You can modify the input array in-place and you do not need to store the results.
You can simply print them out as you compute them.

 */

import java.util.ArrayDeque;
import java.util.Deque;

public class Problem18 {

    public static void main(String[] args) {
        int[] input = {10, 5, 2, 7, 8, 7};
        int k = 3;
        Problem18 p = new Problem18();
        p.maxSubArray(input, k);
    }

    private void maxSubArray(int[] input, int k) {

        Deque<Integer> subArray = new ArrayDeque<>();
        subArray.removeFirst();
        int max =0;

        for(int i=0; i< input.length; i++) {
            if(i == k) {
                subArray.removeFirst();
            }else{
                subArray.add(input[i]);
            }

            if(max < input[i]){
                max = input[i];
            }
        }


    }
}
