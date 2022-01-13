package com.daily.coding;

/*

A number is considered perfect if its digits sum up to exactly 10.

Given a positive integer n, return the n-th perfect number.

For example, given 1, you should return 19. Given 2, you should return 28.

*/

import java.util.Scanner;

public class Problem70 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive number n : ");
        int n = sc.nextInt();
        Problem70 p = new Problem70();
        System.out.println(p.getThePerfectNumber(n));
    }

    private int getThePerfectNumber(int n) {
        int count = 0, i =0;
        while(count != n){
            i++;
            if(checkPerfect(i)) {
                count++;
            }
        }
        return i;
    }

    private boolean checkPerfect(int i) {
        int sum = 0;
        while(i != 0){
            int remainder = i%10;
            sum = sum + remainder;
            i = i/10;
        }
        if(sum == 10){
            return true;
        }
        return false;
    }
}
