package com.daily.coding;

/*
You run an e-commerce website and want to record the last N order ids in a log.

Implement a data structure to accomplish this, with the following API:

record(order_id): adds the order_id to the log

get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem16 {

    private List<String> logs = new ArrayList<>();

    public static void main(String[] args) {

        Problem16 p = new Problem16();

        // record(order_id)
        System.out.println("Enter the order id .. ");
        Scanner sc = new Scanner(System.in);
        String order_id = sc.nextLine();
        p.recordLogs(order_id);


        // get_last(i)
        System.out.println("Enter the ith last element => ");
        int i = sc.nextInt();
        System.out.println(p.getLast(i));
    }

    private String getLast(int i) {
        return this.logs.get(this.logs.size()-i);
    }

    private void recordLogs(String order_id) {
        this.logs.add(order_id);
    }
}
