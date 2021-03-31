package com.test;

import java.util.HashSet;

public class DuplicateExam {

  private static void findDuplicatesUsingHashSet(int [] inputArray)
  {
    HashSet<Integer> set = new HashSet<Integer>();
    for (int element : inputArray)
    {
      if( ! set.add(element))
      {
        System.out.println("Duplicate Element : "+set.add(element));
      }
    }
  }

  public static void main(String[] args) {
    int[] inputArray = new int[] {111, 333, 555, 777, 333, 444, 555};
    findDuplicatesUsingHashSet(inputArray);

  }
}
