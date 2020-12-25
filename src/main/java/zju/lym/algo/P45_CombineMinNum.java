package zju.lym.algo;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 将正整数数组排列成最小数字，如{3,32,321}组成最小数字是321323
 * 将数组按照自定义的规则进行排序
 */
public class P45_CombineMinNum {
  public static String solution(int[] arr) {
    String[] strArr = new String[arr.length];
    for (int i = 0; i < arr.length; i++) {
      strArr[i] = Integer.toString(arr[i]);
    }
    Arrays.sort(strArr, new MyComparator());
    StringBuilder sb = new StringBuilder();
    for (String s : strArr) {
      sb.append(s);
    }
    return sb.toString();
  }

  public static class MyComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
      String s1 = str1 + str2;
      String s2 = str2 + str1;
      return s1.compareTo(s2);
    }
  }
}
