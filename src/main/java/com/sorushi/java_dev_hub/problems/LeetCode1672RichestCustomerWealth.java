package com.sorushi.java_dev_hub.problems;

import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;

/**
 You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the ith customer has in the jth bank.
 Return the wealth that the richest customer has.
 A customer's wealth is the amount of money they have in all their bank accounts.
 The richest customer is the customer that has the maximum wealth.
 */
@Slf4j
public class LeetCode1672RichestCustomerWealth {

  public static void main(String[] args){

    LeetCode1672RichestCustomerWealth problemClass = new LeetCode1672RichestCustomerWealth();

    int[][] accounts = {
        {2,8,7},
        {7,1,3},
        {1,9,5}
    };

    log.info("The richest customer has maximum wealth : {}", problemClass.maximumWealthUsingStream(accounts));
  }

  public int maximumWealth(int[][] accounts) {

    int count = 0;

    for (int[] account : accounts) {
      int tempCount = 0;
      for (int j : account) {
        tempCount = tempCount + j;
      }

      if (tempCount > count) {
        count = tempCount;
      }
    }

    return count;
  }

  public int maximumWealthUsingStream(int[][] accounts) {
    return Arrays.stream(accounts)
        .mapToInt(customAccount -> Arrays.stream(customAccount).sum())
        .max()
        .orElse(0);
  }
}
