package com.codedifferently.problem01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    /**
     * You will be given an array of numbers, search the array and return the longest
     * set of consecutive numbers
     * example input - {1,3,2,10,6,5,7,8}
     * return the String "Longest Set: {5 6 7 8}"
     * Even though 1,2,3 would the first consecutive set 5,6,7,8 is longer
     * @param allNumbers
     * @return
     */
    public String findLongestConsecutiveSet(Integer[] allNumbers){

        ArrayList<Integer> longest = new ArrayList<>();
        Arrays.sort(allNumbers);
        for(int i = 0; i < allNumbers.length-1; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            while(allNumbers[i] +1== allNumbers[i+1]){
                temp.add(allNumbers[i]);
                i++;
                //See if you are at the end of the list
                if(i == allNumbers.length-1){
                    temp.add(allNumbers[i]);
                    break;
                }
            }
            //if the number is not consecutive(while loop ended), then add the number if youre not at the end
            if(i != allNumbers.length-1) {
                temp.add(allNumbers[i]);
            }
            //Check to see if this sequence of consecutive numbers is longer than a previous one you've seen
            if(temp.size() > longest.size()) {
                longest = temp;
            }
        }
        //Convert to a String
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Longest Set: {");
        for(int i = 0; i < longest.size(); i++){
            stringBuilder.append(longest.get(i));
            if(i != longest.size()-1){
                stringBuilder.append(" ");
            }
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
