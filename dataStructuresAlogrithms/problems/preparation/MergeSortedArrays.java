package com.problems.preparation;

import java.util.Arrays;
import java.util.Comparator;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a1 = {0, 3, 5, 12, 19, 26};
        int[] a2 = {1, 7, 8, 14, 18, 20};
        int[] sortedArray = getSortedArray(a1, a2);
        for(int a: sortedArray){
            System.out.print(a + " ");
        }
    }

    public static int[] getSortedArray(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int index = 0;
        for(int a1: arr1){
            result[index] = a1;
            index++;
        }
        for(int a2: arr2){
            result[index] = a2;
            index++;
        }
//        Arrays.sort(result, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer a, Integer b){
//                return b-a;
//            }
//        });
        return result;
    }
}
