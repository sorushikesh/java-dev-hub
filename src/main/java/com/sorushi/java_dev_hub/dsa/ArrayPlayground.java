package com.sorushi.java_dev_hub.dsa;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class ArrayPlayground {

  private static final Logger log = LoggerFactory.getLogger(ArrayPlayground.class);

  public static void main(String[] args) {

    // Declaration and Initialization
    int[] arr = {923, 56, 103, 303, 99};
    log.info("Initialized int array: {}", Arrays.toString(arr));

    // Iteration
    for (int i : arr) {
      log.info("Enhanced for loop element: {}", i);
    }
    for (int i = 0; i < arr.length; i++) {
      log.info("Index {}: {}", i, arr[i]);
    }

    // Multidimensional Array
    int[][] matrix = {
      {1, 2, 3},
      {4, 5, 6}
    };
    log.info("2D array : {}", Arrays.deepToString(matrix));

    // Array of objects
    String[] str = {"Java", "Spring boot", "Microservices"};
    log.info("String array: {}", Arrays.toString(str));

    // Sort array
    int[] sortedArray = Arrays.copyOf(arr, arr.length);
    Arrays.sort(sortedArray);

    log.info("Unsorted array : {}", Arrays.toString(arr));
    log.info("Sorted array : {}", sortedArray);

    // Binary search
    log.info("Index of 303 in sorted array : {}", Arrays.binarySearch(sortedArray, 303));

    Person[] people = {new Person("Mahesh", 30), new Person("Rushikesh", 25)};
    log.info("People array: {}", Arrays.toString(people));
  }

  static class Person {
    String name;
    int age;

    Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public String toString() {
      return name + " (" + age + ")";
    }
  }
}
