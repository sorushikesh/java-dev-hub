package com.sorushi.java_dev_hub.dsa;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class OrderAgnosticBinarySearch {

  public static void main(String[] args) {
    int[] ascendingArray = {2, 4, 6, 8, 10, 12, 14};
    int[] descendingArray = {20, 17, 15, 12, 10, 8, 4};

    log.info("Found at index (ascending): {}", orderAgnosticBinarySearch(ascendingArray, 10));
    log.info("Found at index (descending): {}", orderAgnosticBinarySearch(descendingArray, 10));
    log.info("Not found result: {}", orderAgnosticBinarySearch(ascendingArray, 99));
  }

  public static int orderAgnosticBinarySearch(int[] arr, int target) {
    if (arr == null || arr.length == 0) return -1;

    int start = 0;
    int end = arr.length - 1;

    boolean isAscending = arr[start] < arr[end];

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (arr[mid] == target) return mid;

      if (isAscending) {
        if (target < arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      } else {
        if (target > arr[mid]) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }

    return -1;
  }
}
