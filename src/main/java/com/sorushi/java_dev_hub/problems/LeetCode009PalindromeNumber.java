package com.sorushi.java_dev_hub.problems;

import lombok.extern.slf4j.Slf4j;

/** Given an integer x, return true if x is a palindrome, and false otherwise. */
@Slf4j
public class LeetCode009PalindromeNumber {

  public static void main(String[] args) {

    LeetCode009PalindromeNumber palindromeNumber = new LeetCode009PalindromeNumber();

    int arr = -121;
    log.info("Is int {} is palindrome : {}", arr, palindromeNumber.isPalindrome(arr));
  }

  public boolean isPalindrome(int x) {
    if (x < 0) return false;
    return x == reverseNumber(x);
  }

  public int reverseNumber(int num) {
    int reverse = 0;
    while (num != 0) {
      int remainder = num % 10;
      reverse = reverse * 10 + remainder;
      num = num / 10;
    }

    return reverse;
  }
}
