package com.sorushi.java_dev_hub.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayListPlayground {

  private static final Logger log = LoggerFactory.getLogger(ArrayListPlayground.class);

  public static void main(String[] args) {

    // Declaration and Initialization
    List<Integer> list = new ArrayList<>();
    list.add(10);
    list.add(633);
    list.add(98);
    list.add(20);
    list.add(9999);
    log.info("Arraylist : {}", list);

    // Adding and Removing Elements
    list.add(1, 15);
    list.remove(Integer.valueOf(20));
    list.remove(2);
    log.info("Array list after adding and removing elements : {}", list);

    // Sorting array list
    log.info("Unsorted list : {}", list);
    Collections.sort(list);
    log.info("Sorted list : {}", list);

    // Searching use stream
    list.stream()
        .filter(i -> i == 98)
        .findFirst()
        .ifPresent(i -> log.info("Index position of element 90 is {}", list.indexOf(i)));

    // Filtering
    List<Integer> filteredList = list.stream().filter(i -> i % 2 == 0).toList();

    log.info("Filter array using stream : {}", filteredList);
  }
}
