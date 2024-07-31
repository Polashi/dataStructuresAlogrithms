package com.problems.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LongestWordInDictionary {
    public static void main(String[] args) {
        String[] words = {"w","wo","wor","worl","world"};

    }
    public static void longestWord(String[] words) {
        Arrays.sort(words, new Comparator<String>(){
            @Override
            public int compare(String first, String second){
                return Integer.compare(second.length(), first.length());
            }
        });
        //for () make the return type String when you fix the code
    }
}
