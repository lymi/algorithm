package zju.lym.algo;

/**
 * 长度n+1的数组所有数字均在1~n范围内，至少有一个重复
 * 找出任意一个重复数字，不能改变数组
 * 二分查找的变形，空间复杂度O(1)，时间复杂度O(nlogn)
 */
public class P03_FindAnyDuplicate {
  // m~n的数字在arr中出现的次数
  private static int count(int[] arr, int m, int n) {
    int cnt = 0;
    for (int value : arr) {
      if (value >= m && value <= n) cnt++;
    }
    return cnt;
  }

  public static int solution(int[] arr) {
    int low = 1, high = arr.length-1, middle;
    while (low < high) {
      middle = (low + high) >> 1;
      if (count(arr, low, middle) > middle - low + 1) {
        high = middle;
      } else {
        low = middle + 1;
      }
    }
    return low;
  }
}

