package com.sorushi.java_dev_hub.problems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target.
 */
public class LeetCode001TwoSum {

  private static final Logger log = LoggerFactory.getLogger(LeetCode001TwoSum.class);

  public static void main(String[] args) {

    int[] numberArray = {1, 2, 7, 5, 11, 15, 12};
    int target = 27;

    log.info("Elements at index {} have sum {}", twoSum(numberArray, target), target);
  }

  public static int[] twoSum(int[] nums, int target) {

    int[] arr = new int[2];

    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          arr[0] = i;
          arr[1] = j;
          break;
        }
      }
    }

    return arr;
  }
}
