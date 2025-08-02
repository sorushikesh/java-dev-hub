package com.sorushi.java_dev_hub.dsa;

import static com.sorushi.java_dev_hub.utils.FootballStats.topDivisionClubs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

/**
 * The linear search algorithm, also known as sequential search, is a straightforward method for
 * finding a target element within a list or array. It operates by sequentially examining each
 * element in the collection until either the target element is found or the end of the collection
 * is reached.
 * -
 * Algorithm Steps: Initialization: Start at the first element (index 0) of the array.
 * Comparison: Compare the current element with the target element. Match Found: If the current
 * element matches the target element, return the index of the current element and terminate the
 * search. No Match: If the current element does not match, move to the next element in the array.
 * Iteration: Repeat steps until the target element is found or all elements in the array have been
 * checked. Element Not Found: If the entire array has been traversed and the target element was not
 * found, return a value indicating its absence.
 */
@Slf4j
public class LinearSearchAlgorithm {

  public static void main(String[] args) {

    LinearSearchAlgorithm linearSearchAlgorithm = new LinearSearchAlgorithm();

    String prefix = "FC";

    linearSearchAlgorithm.filterClubsUsingLinearSearchAlgorithm(prefix, topDivisionClubs);
    linearSearchAlgorithm.filterClubsWithForLoop(prefix, topDivisionClubs);
    linearSearchAlgorithm.filterClubsWithStreams(prefix, topDivisionClubs);
  }

  /** A method demonstrating linear search to filter clubs starting with a prefix. */
  public void filterClubsUsingLinearSearchAlgorithm(String prefix, String[] array) {
    long start = System.nanoTime();

    List<String> result = new ArrayList<>();
    for (int i = 0; i < array.length; i++) {
      String currentClub = array[i];
      if (currentClub.startsWith(prefix)) {
        result.add(currentClub);
      }
    }

    long end = System.nanoTime();
    log.info("Execution time (linearSearchAlgorithm): {} μs", (end - start) / 1000);
  }

  /** Filters the array using a basic for-loop (linear search). */
  public void filterClubsWithForLoop(String prefix, String[] array) {
    long start = System.nanoTime();

    List<String> result = new ArrayList<>();
    for (String club : array) {
      if (club.startsWith(prefix)) {
        result.add(club);
      }
    }

    long end = System.nanoTime();
    log.info("Execution time (for-loop): {} μs", (end - start) / 1000);
  }

  /** Filters the array using Java Stream API. */
  public void filterClubsWithStreams(String prefix, String[] array) {
    long start = System.nanoTime();

    Arrays.stream(array).filter(club -> club.startsWith(prefix)).toList();

    long end = System.nanoTime();
    log.info("Execution time (stream): {} μs", (end - start) / 1000);
  }
}
