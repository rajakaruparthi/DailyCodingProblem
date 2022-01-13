package com.daily.coding;

import java.util.Stack;

/*

Given a string of round, curly, and square open and closing brackets,

return whether the brackets are balanced (well-formed).

For example, given the string "([])[]({})", you should return true.

Given the string "([)]" or "((()", you should return false.

*/

public class Problem27 {

    public static void main(String[] args) {
        String input = "([])]({})";
        System.out.println(checkBrackets(input));
    }

    private static boolean checkBrackets(String input) {
        char[] inputAry = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<inputAry.length; i++) {

            if(inputAry[i] == '{' || inputAry[i] == '(' || inputAry[i] == '[') {
                stack.push(inputAry[i]);
            }
            char opened = 0;
            if(inputAry[i] == '}' || inputAry[i] == ')' || inputAry[i] == ']') {
                if(!stack.empty())
                    opened = stack.pop();
                else
                    return false;
                boolean check = checkTheRecentPushedChar(opened, inputAry[i]);
                if(!check) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkTheRecentPushedChar(char opened, char closed) {
        if (opened == '{' && closed == '}') {
            return true;
        }
        else if(opened == '[' && closed == ']'){
            return true;
        }
        else if(opened == '(' && closed == ')') {
            return true;
        }
        return false;
    }
}
