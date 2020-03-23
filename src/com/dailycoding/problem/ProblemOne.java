package com.dailycoding.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 */

public class ProblemOne {

    public static void main(String[] args) {
        Integer[] a = {10, 15, 3, 7};
        List<Integer> numbers = Arrays.asList(a);
        int num = 10;
        System.out.println(sumIsPresentSinglePass(numbers, num));
        System.out.println(sumIsPresent(numbers, num));
    }

    private static boolean sumIsPresent(List<Integer> numbers, int num) {
        Collections.sort(numbers);
        // single pass
        for(int i=0; i<numbers.size(); i++) {
            int diff = num - numbers.get(i);
            if(diff < 0){
                return false;
            }else{
                return numbers.contains(diff);
            }
        }
        return false;
    }

    private static boolean sumIsPresentSinglePass(List<Integer> numbers, int num) {
        // Double pass
        for (int i=0; i<numbers.size(); i++) {
            for (int j = 1; j < numbers.size(); j++) {
                if(numbers.get(i)+numbers.get(j) == num){
                    return true;
                }
            }
        }
      return false;
    }
}
