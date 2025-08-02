package com.sorushi.java_dev_hub.problems;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

/** Given an array nums of integers, return how many of them contain an even number of digits. */
@Slf4j
public class LeetCode1295FindNumberswithEvenNumberOfDigits {

  public static void main(String[] args) {

    LeetCode1295FindNumberswithEvenNumberOfDigits problemClass =
        new LeetCode1295FindNumberswithEvenNumberOfDigits();

    int[] nums = {12, 345, 2, 6, 7896};
    log.info("Number of even digits : {}", problemClass.findNumbers(nums));
  }

  /** Solution using stream API */
  public int findNumbersUsingStream(int[] nums) {
    return Math.toIntExact(
        Arrays.stream(nums).filter(i -> String.valueOf(i).length() % 2 == 0).count());
  }

  public int findNumbers(int[] nums) {

    int result = 0;

    for (int num : nums) {
      if (isEven(num)) {
        result++;
      }
    }
    return result;
  }

  boolean isEven(int num) {
    return countDigits(num) % 2 == 0;
  }

  int countDigits(int num) {
    return (int) (Math.floor((Math.log10(num) + 1)));
  }
}
