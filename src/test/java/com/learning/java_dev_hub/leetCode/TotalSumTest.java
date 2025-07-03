package com.learning.java_dev_hub.leetCode;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class TotalSumTest {

  @Test
  void totalSum() {
    TotalSum totalSum = new TotalSum();
    int[] nums = {2, 3, 7, 11, 15};
    int target = 9;
    int[] expectedResult = {0,2};

    int[] result = totalSum.findTwoSum(nums, target);

    log.info("Result : {}", result);
    assertNotNull(result);
    assertArrayEquals(expectedResult, result);
  }
}
