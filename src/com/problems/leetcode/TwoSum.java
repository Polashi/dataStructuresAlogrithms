package com.problems.leetcode;

import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args) {
        System.out.print(isSum(new int[]{1,2,3,4},6));
    }

    public static boolean isSum(int[] arr, int k){
        HashSet<Integer> set = new HashSet<>();
        for(int a: arr){
            set.add(a);
        }
        for (int j : arr) {
            if (set.contains(k - j)) return true;
        }
        return false;
    }
}
