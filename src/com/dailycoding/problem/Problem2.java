package com.dailycoding.problem;


/*

Given an array of integers,
return a new array such that each element at index i of the new array is the
product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5],
the expected output would be [120, 60, 40, 30, 24].
If our input was [3, 2, 1], the expected output would be [2, 3, 6].

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 3, 4, 5);
        multiplyOther(input);
    }

    private static void multiplyOther(List<Integer> input) {
        List<Integer> output = new ArrayList<>();
        int product;
        for (int i=0; i< input.size();i++){
            product = 1;
            for (int j=0; j < input.size(); j++){
                if(j!=i){
                    product = product * input.get(j);
                }
            }
            output.add(product);
        }
        System.out.println(output);
    }
}
