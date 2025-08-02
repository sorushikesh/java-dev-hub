package com.sorushi.java_dev_hub.problems;

import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LeetCode013RomanToInteger {

  public static void main(String[] args) {

    LeetCode013RomanToInteger leetCode013RomanToInteger = new LeetCode013RomanToInteger();

    log.info(
        "Integer value for roman format MCMXCIV is {}",
        leetCode013RomanToInteger.romanToIntSol2("MCMXCIV"));
  }

  public int romanToIntSol1(String str) {

    Map<String, Integer> romanValues = new HashMap<>();
    romanValues.put("I", 1);
    romanValues.put("V", 5);
    romanValues.put("X", 10);
    romanValues.put("L", 50);
    romanValues.put("C", 100);
    romanValues.put("D", 500);
    romanValues.put("M", 1000);

    int count = 0;

    for (int i = 0; i < str.length(); ) {

      if (str.length() == (i + 1)) {
        count = count + romanValues.get(String.valueOf(str.charAt(i)));
        break;
      }
      if (romanValues.get(String.valueOf(str.charAt(i)))
          < romanValues.get(String.valueOf(str.charAt(i + 1)))) {
        int tempCount =
            romanValues.get(String.valueOf(str.charAt(i + 1)))
                - romanValues.get(String.valueOf(str.charAt(i)));
        count = count + tempCount;
        i = i + 2;
        continue;
      }
      count = count + romanValues.get(String.valueOf(str.charAt(i)));
      i = i + 1;
    }

    return count;
  }

  public int romanToIntSol2(String str) {

    Map<String, Integer> romanValues = new HashMap<>();
    romanValues.put("I", 1);
    romanValues.put("V", 5);
    romanValues.put("X", 10);
    romanValues.put("L", 50);
    romanValues.put("C", 100);
    romanValues.put("D", 500);
    romanValues.put("M", 1000);

    int count = 0;

    for (int i = 0; i < str.length(); i++) {

      int currentVal = romanValues.get(String.valueOf(str.charAt(i)));
      int nextVal = 0;

      if (i + 1 < str.length()) {
        nextVal = romanValues.get(String.valueOf(str.charAt(i + 1)));
      }

      if (nextVal > currentVal) {
        count = count + nextVal - currentVal;
        i++;
      } else {
        count = count + currentVal;
      }
    }

    return count;
  }
}
