package com.learning.java_dev_hub.leetCode;

import java.util.HashMap;
import java.util.Map;

public class TotalSum {

  public int[] findTwoSum(int[] numberArray, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < numberArray.length; i++) {
      int complement = target - numberArray[i];
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }
      map.put(numberArray[i], i);
    }
    return new int[] {};
  }
}
