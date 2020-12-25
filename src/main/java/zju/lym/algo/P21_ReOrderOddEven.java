package zju.lym.algo;

import zju.lym.utils.Utils;

/**
 * 调整数组顺序使奇数位于偶数前面
 * partition函数的变形，时间复杂度O(n)
 */
public class P21_ReOrderOddEven {
  public static void solution(int[] arr) {
    int i = 0, j = arr.length - 1;
    while (i < j) {
      while (i < j && arr[i] % 2 != 0) i++;
      while (i < j && arr[j] % 2 == 0) j--;
      if (i < j) {
        Utils.swap(arr, i, j);
      }
    }
  }
}
