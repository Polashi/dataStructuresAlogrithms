package com.problems.preparation;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'b', 'b','b','c'};
        System.out.println(solve(chars));
    }
    public static int solve(char[] chars){
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char prevChar = chars[0];
        for(int i=1; i<chars.length; i++){
            if(chars[i] == prevChar){
                count++;

            }else if(count == 1){
                sb.append(prevChar);
                count = 0;
            }else{
                sb.append(prevChar);
                sb.append(count);
                count = 0;
            }
            prevChar = chars[i];
        }
        return sb.length();
    }
}
