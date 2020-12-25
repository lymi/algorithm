package zju.lym.algo;

/**
 * 找出长度为n递增排序数组缺失的值
 * 数组所有值均在0 ~ n-1范围内，无重复
 * 二分查找，若i == arr[i]说明缺失值在i之后，否则在i之前
 */
public class P53_FindMissingNum {
  public static int solution(int[] arr) {
    if (arr == null || arr.length == 0) return -1;
    int low = 0, high = arr.length - 1, middle;
    while (low <= high) {
      middle = (low + high) >> 1;
      if (arr[middle] == middle) {
        low = middle+1;
      } else {
        if (middle == low || arr[middle-1] == middle-1) return middle;
        high = middle-1;
      }
    }
    return -1;
  }
}
