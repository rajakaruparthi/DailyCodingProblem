package com.daily.coding;

/*
    Using a function rand7() that returns an integer from 1 to 7 (inclusive) with uniform probability,
    implement a function rand5() that returns an integer from 1 to 5 (inclusive).
 */

import java.util.Random;

public class Problem71 {

    public int rand7(){
        Random r = new Random();
        return r.nextInt(6);
    }

    public int rand5(){
        int rand = rand7()+1;
        return  rand > 5 ? rand%5 : rand;
    }

    public static void main(String[] args) {
        Problem71 p = new Problem71();
        p.rand7();
        System.out.println(p.rand5());
    }
}
