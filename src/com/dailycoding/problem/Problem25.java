package com.daily.coding;

/*

This problem was asked by Facebook.

Implement regular expression matching with the following special characters:

. (period) which matches any single character
* (asterisk) which matches zero or more of the preceding element That is,

implement a function that takes in a string and a valid regular expression and
returns whether or not the string matches the regular expression.

For example, given the regular expression "ra." and the string "ray",

your function should return true. The same regular expression on the string "raymond" should return false.

Given the regular expression ".*at" and the string "chat", your function should return true.
The same regular expression on the string "chats" should return false.
 */

public class Problem25 {

    public static void main(String[] args) {
        String regex = "";
        String input = "";
        checkIfValid(regex, input);
    }

    private static void checkIfValid(String regex, String input) {
        for (int i=0; i< input.length(); i++) {

        }
    }
}
