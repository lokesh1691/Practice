package com.pratcice.coreJava8;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
     Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch, i);        //Populate hashmap with character and its respective index in the string
            }else{
                map.put(ch, -1);       //If the character has been seen before, just replace the value as -1
            }
        }
        int min = Integer.MAX_VALUE;
        for(char key : map.keySet()){
            if(map.get(key)== -1) continue;
            min = Math.min(map.get(key), min);
        }
        if(min == Integer.MAX_VALUE) return -1;     // This means minimum was not changed so no character was repeated
        return min;
    }

    public static void main (String []args) {
      String s = "leetecode";
      Solution sol = new Solution();
      System.out.println(sol.firstUniqChar(s));
    }
}