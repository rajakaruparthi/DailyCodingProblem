package com.daily.coding;

import java.util.*;
import java.util.function.Consumer;

/*
Given a dictionary of words and a string made up of those words (no spaces), return the original sentence in a list.

If there is more than one possible reconstruction, return any of them. If there is no possible reconstruction, then return null.


For example, given the set of words "quick", "brown", "the", "fox", and the string "thequickbrownfox",

you should return ["the", "quick", "brown", "fox"].

Given the set of words "bed", "bath", "bedbath", "and", "beyond", and the string "bedbathandbeyond",

return either ["bed", "bath", "and", "beyond] or ["bedbath", "and", "beyond"].


 */
public class Problem22 {

    static List<List<String>> output = new ArrayList<>();

    public static void main(String[] args) {

        List<String> dictionary = new ArrayList<>(Arrays.asList("quick", "brown", "the", "fox"));
        
        List<String> dictionary2 = new ArrayList<>(Arrays.asList("bed", "bath", "bedbath", "and", "beyond"));

        String input2 = "bedbathandbeyond";

        String input = "thequickbrownfox";

        System.out.println("-------------------------- Dictionary 1 ------------------------");

        dictionary.stream().forEach(s -> {
            if(input.indexOf(s) != -1){
                System.out.println(input.indexOf(s)+"--"+s);
            }
        });

        System.out.println("-------------------------- Dictionary 2 ------------------------");

        dictionary2.stream().forEach(s -> {
            if(input2.indexOf(s) != -1){
                System.out.println(input2.indexOf(s)+"--"+s);
            }
        });

        returnTheWords(dictionary, input);
    }

    private static List<String> returnTheWords(List<String> dictionary, String input) {

        StringBuffer substr = new StringBuffer();

        List<String> reconstructions = new ArrayList<>();

        for (int i=0; i<input.length(); i++) {
            substr.append(input.charAt(i));

            if(dictionary.contains(substr.toString())){
                System.out.println();
                reconstructions.add(substr.toString());
                substr = new StringBuffer();
            }
        }
        System.out.println("Dicto"+ dictionary+"--size"+ dictionary.size());
        System.out.println("recon"+reconstructions+"--size"+reconstructions.size());

        if (dictionary.size() == reconstructions.size()){
            output.add(reconstructions);
            System.out.println(output);
            return reconstructions;
        } else{

        }

        return null;
    }
}



