package com.test;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class MySort {
  public int firstUniqChar(String s) {
    if (s.length()==0) return -1;
    if (s.length()==1) return 0;

    HashMap<Character,Integer> count = new HashMap<Character,Integer>();

    for(int i=0;i<s.length();i++)
    {
      if(count.containsKey(s.charAt(i)))
        count.put(s.charAt(i),count.get(s.charAt(i))+1);
      else
        count.put(s.charAt(i),1);
    }


    for(int i=0;i<s.length();i++)
    {
      if(count.get(s.charAt(i))==1)
        return i;
    }

    return -1;
  }

  public static void main (String []args) {
    String arr1 = "leetcode";
    String arr2 = "loveleetcode";

    System.out.println("Return value"+ new MySort().firstUniqChar(arr2));

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,6,8,7,9,10);
    numbers.stream().filter(s -> s%2 == 0).forEach(System.out ::print);


  }

}