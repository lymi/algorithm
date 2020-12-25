package zju.lym.algo;

/**
 * 有序数组中K出现的次数
 * 二分查找，分别找出K第一次和最后一次出现的位置
 */
public class P53_TimesOfK {
  private static int getFirstK(int[] arr, int K) {
    int i = 0, j = arr.length - 1, middle;
    while (i <= j) {
      middle = (i + j) >> 1;
      if (arr[middle] > K) {
        j = middle - 1;
      } else if (arr[middle] < K) {
        i = middle + 1;
      } else {
        if (middle == 0 || arr[middle-1] != K) return middle;
        j = middle - 1;
      }
    }
    return -1;
  }

  private static int getLastK(int[] arr, int K) {
    int i = 0, j = arr.length - 1, middle;
    while (i <= j) {
      middle = (i + j) >> 1;
      if (arr[middle] > K) {
        j = middle - 1;
      } else if (arr[middle] < K) {
        i = middle + 1;
      } else {
        if (middle == arr.length-1 || arr[middle+1] != K) return middle;
        i = middle + 1;
      }
    }
    return -1;
  }

  public static int solution(int[] arr, int K) {
    if (arr == null || arr.length == 0) return 0;
    int firstK = getFirstK(arr, K);
    int lastK = getLastK(arr, K);
    if (firstK != -1 && lastK != -1) return lastK - firstK + 1;
    return 0;
  }
}
