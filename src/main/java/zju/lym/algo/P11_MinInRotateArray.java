package zju.lym.algo;

/**
 * 查找旋转数组中的最小值。{3,4,5,6,1,2} 是 {1,2,3,4,5,6}的旋转数组
 * 二分查找变形
 * 当arr[low],arr[middle],arr[high]值相等时，无法确定最小值，此时需遍历数组查找
 */
public class P11_MinInRotateArray {
  public static int solution(int[] arr) {
    int low = 0, high = arr.length - 1;
    while (low < high) {
      int middle = (low + high) >> 1;

      if (arr[low] == arr[middle] && arr[middle] == arr[high]) {
        int min = arr[low];
        for (int i = low; i <= high; i++) {
          if (arr[i] < min) min = arr[i];
        }
        return min;
      }

      if (arr[middle] > arr[high]) {
        low = middle + 1;
      } else {
        high = middle;
      }
    }

    return arr[low];
  }
}
