package com.problems.preparation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HighestAverageScore {
    public static void main(String[] args) {
        String[][] input = {{"Bob","87"}, {"Mike", "35"},{"Bob", "52"}, {"Jason","35"}, {"Mike", "55"}, {"Jessica", "99"}};
        System.out.println(getHighestAvgScore(input));
    }

    public static int getHighestAvgScore(String[][] array){
        HashMap<String, List<Integer>> map = new HashMap<>();
        for(String[] arr: array){
            String name = arr[0];
            int mark = Integer.parseInt(arr[1]);
            if(!map.containsKey(name)){
                List<Integer> marks = new ArrayList<>();
                marks.add(mark);
                map.put(name,marks);
            }else{
                List<Integer> marks = map.get(name);
                marks.add(mark);
                map.put(name, marks);
            }
        }
        double avg = 0;
        for(List<Integer> list: map.values()){
            int sum = 0;
            for(int a: list){
                sum +=a;
            }
            avg = Math.max(avg, (double) sum/list.size());
        }
        if(avg % 1 != 0){
            return (int) Math.floor(avg);
        }
        return (int) avg;
    }
}
