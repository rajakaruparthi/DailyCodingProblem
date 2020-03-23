package com.dailycoding.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
Implement an autocomplete system.
That is, given a query string s and a set of all possible
query strings, return all strings in the set that have s as a prefix.

For example, given the query string de and the set of strings [dog, deer, deal],
return [deer, deal].

 */
public class Problem11 {

    public static void main(String[] args) {
        List<String> input = Arrays.asList("dog", "deer", "deal", "adea", "deemed", "dead");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the query string");
        String query = sc.nextLine();
        autocomplete(input, query);
    }

    private static void autocomplete(List<String> input, String query) {
        List<String> collect = input
                .stream()
//              .filter(each -> each.contains(query))
                .filter(each -> each.indexOf(query) == 0)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
