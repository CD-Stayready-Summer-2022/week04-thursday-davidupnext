package com.codedifferently.problem02;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public String howManyLettersDoYouSee(String input){
        Map<String, Integer> letterCount = new TreeMap<>();
        String[] letters = input.split("\\w");
        for (String letter : letters){
            if (letterCount.containsKey(letter)){
                letterCount.put(letter,letterCount.get(letter)+1);
            }
            else
                letterCount.put(letter, 1);
        }
        return String.format("%s",letterCount);
    }
}
