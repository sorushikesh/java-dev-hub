package com.sorushi.java_dev_hub.dsa;

import com.sorushi.java_dev_hub.utils.FootballStats;
import java.util.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinarySearchAlgorithm {

  public static void main(String[] args) {
    BinarySearchAlgorithm binarySearchAlgorithm = new BinarySearchAlgorithm();
    binarySearchAlgorithm.getListOfClubsStartsWithPrefix(FootballStats.getTopDivisionClubs(), "FC");
  }

  public void getListOfClubsStartsWithPrefix(String[] strArr, String prefix) {

    long start = System.nanoTime();

    List<String> result = new ArrayList<>();

    Arrays.sort(strArr);

    int low = 0;
    int high = strArr.length - 1;
    int firstMatchIndex = -1;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      String midVal = strArr[mid];

      if (midVal.startsWith(prefix)) {
        firstMatchIndex = mid;
        break;
      } else if (midVal.compareTo(prefix) < 0) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }

    if (firstMatchIndex == -1) {
      log.info("No clubs found with prefix '{}'", prefix);
      return;
    }

    int left = firstMatchIndex;
    while (left >= 0 && strArr[left].startsWith(prefix)) {
      result.add(strArr[left]);
      left--;
    }

    int right = firstMatchIndex + 1;
    while (right < strArr.length && strArr[right].startsWith(prefix)) {
      result.add(strArr[right]);
      right++;
    }

    long end = System.nanoTime();
    log.info("Execution time (Binary search): {} μs", (end - start) / 1000);
    log.info("Clubs starting with prefix '{}': {}", prefix, result);
  }
}
