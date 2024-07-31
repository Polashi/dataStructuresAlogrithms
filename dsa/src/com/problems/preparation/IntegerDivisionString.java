package com.problems.preparation;

import java.util.HashMap;

public class IntegerDivisionString {
    public static void main(String[] args) {
        int num = -1;
        int den = -2147483648;

        System.out.println(result(num, den));
    }
    public static String result(int num, int den){
        if(den == 0){
            return "0";
        }
        StringBuilder ans = new StringBuilder();
        long numL = (long) num;
        long denL = (long) den;
        long q = numL/denL;
        long r = numL%denL;
        if(numL<0 && denL>0 || numL>0 && denL<0){
            ans.append("-");
        }
        ans.append(q);
        if(r != 0){
            ans.append(".");
            HashMap<Long, Integer> map = new HashMap<>();
            while(r != 0){
                if(map.containsKey(r)){
                    int len = map.get(r);
                    ans.insert(len,"(");
                    ans.append(")");
                    break;
                }else{
                    map.put(r,ans.length());
                    r = r*10;
                    q = r/den;
                    r = r%den;
                    ans.append(Math.abs(q));
                }
            }
        }
        return ans.toString();
    }
}
