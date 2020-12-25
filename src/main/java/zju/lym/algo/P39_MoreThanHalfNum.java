package zju.lym.algo;

import zju.lym.utils.Utils;

/**
 * 找到数组中出现次数超过一半的数字
 * 转换为找中位数，若存在出现次数超过一半的数字，则必定是中位数
 * 找到中位数后要验证其出现次数是否超过一半
 * 找中位数转化为用partition函数寻找数组中第K大的数
 * 其中K = (arr.length - 1) >> 2
 */
public class P39_MoreThanHalfNum {
  public static int solution(int[] arr) {
    if (arr == null || arr.length == 0) return -1;
    int low = 0, high = arr.length - 1, pivot;
    int middle = high >> 1;
    while (low < high) {
      pivot = Utils.partition(arr, low, high);
      if (pivot < middle) {
        low = pivot + 1;
      } else {
        high = pivot - 1;
      }
    }
    int result = arr[middle];
    int times = 0;
    for (int i : arr) {
      if (arr[i] == result) times++;
    }
    if (times * 2 <= arr.length) return -1;
    return result;
  }
}
